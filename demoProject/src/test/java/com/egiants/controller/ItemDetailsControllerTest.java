package com.egiants.controller;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.egiants.entity.ItemDetails;
import com.egiants.service.ItemDetailsService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ItemDetailsControllerTest {
	private MockMvc mockMvc;

	@Mock
	private ItemDetailsService service;

	@InjectMocks
	private ItemDetailsController itemDtailsController;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(itemDtailsController).build();
	}

	@Test
	public void testFindDetailsByIDMethodSuccessCase() throws Exception {
		BigDecimal price = new BigDecimal(200);
		ItemDetails itemDetailsMock = new ItemDetails((long) 2, "Description1", "Specifiation1", (long) 100, price,
				"Brand1");

		when(service.getItemDetails((long) 2)).thenReturn(itemDetailsMock);

		mockMvc.perform(get("/itemDetails/2").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.itemId", is(2))).andExpect(jsonPath("$.itemDescription", is("Description1")))
				.andExpect(jsonPath("$.specification", is("Specifiation1"))).andExpect(jsonPath("$.stock", is(100)))
				.andExpect(jsonPath("$.itemBrand", is("Brand1"))).andExpect(jsonPath("$.*", Matchers.hasSize(5)));

		verify(service, times(1)).getItemDetails((long) 2);
		verifyNoMoreInteractions(service);
	}

	@Test
	public void testFindDetailsByIDMethodNullCase() throws Exception {
		when(service.getItemDetails((long) 2)).thenReturn(null);

		mockMvc.perform(get("/itemDetails/2").accept(MediaType.APPLICATION_JSON))
				/*
				 * .andExpect(jsonPath("$.itemId", is(""))) .andExpect(jsonPath("$.itemName",
				 * is(null))) .andExpect(jsonPath("$.price", is(null)))
				 */
				.andExpect(status().is(200));

		// .andExpect(jsonPath("$", Matchers.nullValue()));

		verify(service, times(1)).getItemDetails((long) 2);
		verifyNoMoreInteractions(service);
	}
}
