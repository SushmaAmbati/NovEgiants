package com.egiants.controller;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.egiants.dao.ItemRepository;
import com.egiants.entity.Item;
import com.egiants.entity.ItemDetails;
import com.egiants.service.ItemDetailsService;
import com.egiants.service.ItemService;
import com.egiants.utils.TestUtils;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
public class ItemControllerTest {

	private MockMvc mockMvc;

	@Mock
	private ItemService service;

	@Mock
	private Item item;
	
	@Mock
	private Iterable<Item> items;
	
	@Mock
	private ItemRepository itemRepository;
	
	@Mock
	private ItemController itemController;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(itemController).build();
		
//		service = new ItemService();
//		service.setItemRepository(itemRepository);
	}
	
	@Test
	public void testMockCreation() {
		assertNotNull(service);
		assertNotNull(item);
		assertNotNull(items);
	}

	@Test
	public void testFindByIDMethodSuccessCase() throws Exception {
//		BigDecimal price = new BigDecimal(350);
//		
//		Item itemMock = new Item((long) 2, "itemname", (long) 100, (long) 200, price);

//		when(service.getItem((long) 2)).thenReturn(item);
//
//		mockMvc.perform(get("/items/find/2").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
//				.andExpect(jsonPath("$.itemId", is(2))).andExpect(jsonPath("$.itemName", is("itemname")))
//				.andExpect(jsonPath("$.brandId", is(100))).andExpect(jsonPath("$.productId", is(200)))
//				.andExpect(jsonPath("$.price", is(350))).andExpect(jsonPath("$.*", Matchers.hasSize(5)));
//
//		verify(service, times(1)).getItem((long) 2);
//		verifyNoMoreInteractions(service);
		
		Long itemId = (long) 3;

        mockMvc.perform(
                get("/items/" + itemId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("data.itemId", is(3)))
                .andExpect(jsonPath("data.itemName", is("Galaxy S7")))
                .andExpect(jsonPath("data.brandId", is(300)))
                .andExpect(jsonPath("data.price", is(500)))
                .andExpect(jsonPath("success", is(true)));
	}

	@Test
	public void testFindByIDMethodNullCase() throws Exception {
		when(service.getItem((long) 2)).thenReturn(null);

		mockMvc.perform(get("/items/find/2").accept(MediaType.APPLICATION_JSON))
				/*
				 * .andExpect(jsonPath("$.itemId", is(""))) .andExpect(jsonPath("$.itemName",
				 * is(null))) .andExpect(jsonPath("$.price", is(null)))
				 */
				.andExpect(status().is(200));

		// .andExpect(jsonPath("$", Matchers.nullValue()));

		verify(service, times(1)).getItem((long) 2);
		verifyNoMoreInteractions(service);
	}

	@Test
	public void testFindAllMethod() throws Exception {
//		BigDecimal price1 = new BigDecimal(300);
//		Item itemMock1 = new Item((long) 1, "itemname1", (long) 150, (long) 250, price1);
//		BigDecimal price2 = new BigDecimal(400);
//		Item itemMock2 = new Item((long) 2, "itemname2", (long) 150, (long) 250, price2);
//
//		ArrayList<Item> itemsMock = new ArrayList<Item>();
//		itemsMock.add(itemMock1);
//		itemsMock.add(itemMock2);
//		Iterable<Item> itemsMockIterable = itemsMock;

		when(service.getAllItems()).thenReturn(items);

		mockMvc.perform(get("/items/findAll")).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtils.APPLICATION_JSON_UTF8))
				.andExpect(jsonPath("$", Matchers.hasSize(2))).andExpect(jsonPath("$[0].itemId", is(1)))
				.andExpect(jsonPath("$[0].itemName", is("itemname1"))).andExpect(jsonPath("$[0].brandId", is(150)))
				.andExpect(jsonPath("$[0].productId", is(250))).andExpect(jsonPath("$[0].price", is(300)))
				.andExpect(jsonPath("$[1].itemId", is(2))).andExpect(jsonPath("$[1].itemName", is("itemname2")))
				.andExpect(jsonPath("$[1].brandId", is(150))).andExpect(jsonPath("$[1].productId", is(250)))
				.andExpect(jsonPath("$[1].price", is(400)));
		verify(service, times(1)).getAllItems();
		verifyNoMoreInteractions(service);
	}

	// @Test
	public void testPostMethodSuccessCase() throws Exception {
		/*
		 * String json = "{\n" + "  \"itemId\": \"1\",\n" +
		 * "  \"itemName\": \"SomeItem\",\n" + "  \"price\": \"100\"\n" + "}";
		 */
//		BigDecimal price = new BigDecimal(200);
//		Item itemMock = new Item((long) 2, "itemname", (long) 150, (long) 250, price);

		// Mockito.spy(service.addItem(itemMock));

		mockMvc.perform(post("/items/post").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		/*
		 * mockMvc.perform(get("/items/find/2").accept(MediaType.APPLICATION_JSON)).
		 * andExpect(status().isOk()) .andExpect(jsonPath("$.itemId", is(2)))
		 * .andExpect(jsonPath("$.itemName", is("itemname")))
		 * .andExpect(jsonPath("$.price", is(20))) .andExpect(jsonPath("$.*",
		 * Matchers.hasSize(3)));
		 */

		verify(service, times(1)).addItem(item);
		// verify(service, times(1)).getItem((long) 2);
		verifyNoMoreInteractions(service);
	}

	@Test
	public void testDeleteMethod() throws Exception {
//		BigDecimal price1 = new BigDecimal(300);
//		Item itemMock1 = new Item((long) 1, "itemname1", (long) 150, (long) 250, price1);
//		BigDecimal price2 = new BigDecimal(400);
//		Item itemMock2 = new Item((long) 2, "itemname2", (long) 150, (long) 250, price2);
//
//		ArrayList<Item> itemsMock = new ArrayList<Item>();
//		itemsMock.add(itemMock1);
//		itemsMock.add(itemMock2);
//		Iterable<Item> itemsMockIterable = itemsMock;

		when(service.getAllItems()).thenReturn(items);

		mockMvc.perform(get("/items/findAll")).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtils.APPLICATION_JSON_UTF8))
				.andExpect(jsonPath("$", Matchers.hasSize(2))).andExpect(jsonPath("$[0].itemId", is(1)))
				.andExpect(jsonPath("$[0].itemName", is("itemname1"))).andExpect(jsonPath("$[0].brandId", is(150)))
				.andExpect(jsonPath("$[0].productId", is(250))).andExpect(jsonPath("$[0].price", is(300)))
				.andExpect(jsonPath("$[1].itemId", is(2))).andExpect(jsonPath("$[1].itemName", is("itemname2")))
				.andExpect(jsonPath("$[1].brandId", is(150))).andExpect(jsonPath("$[1].productId", is(250)))
				.andExpect(jsonPath("$[1].price", is(400)));
		verify(service, times(1)).getAllItems();
		verifyNoMoreInteractions(service);
	}

}
