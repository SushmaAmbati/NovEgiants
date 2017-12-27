package com.egiants.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.egiants.dao.ItemDetailsRepository;
import com.egiants.entity.ItemDetails;

public class ItemDetailsServiceTest {

	private ItemDetailsService itemDetailsService;
	@Mock
	private ItemDetailsRepository itemDetailsRepository;

	@Mock
	private ItemDetails itemDetails;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
		itemDetailsService = new ItemDetailsService();

		itemDetailsService.setItemDetailsRepository(itemDetailsRepository);
	}

	@Test
	public void testMockCreation() {
		assertNotNull(itemDetailsService);
		assertNotNull(itemDetailsRepository);
		assertNotNull(itemDetails);
	}

	@Test
	public void shouldReturnItem_Details_whenGetItemDetailsByIdIsCalled() throws Exception {
		// Arrange
		when(itemDetailsRepository.findOne((long) 1)).thenReturn(itemDetails);
		// Act
		ItemDetails retrievedProduct = itemDetailsService.getItemDetails((long) 1);
		// Assert
		assertThat(retrievedProduct, is(equalTo(itemDetails)));
	}

	@Test
	public void itemDetailsSaved_whenSaveItemDetailsIsCalledOnExistingITem() throws Exception {
		// Arrange
		when(itemDetailsRepository.save(itemDetails)).thenReturn(itemDetails);
		// Act
		itemDetailsService.updateItemDetails("3", itemDetails);
		// Assert
		verify(itemDetailsRepository, times(1)).save(itemDetails);
	}

	@Test
	public void itemSaved_whenSaveItemDetailsIsCalledItem() throws Exception {
		// Arrange
		when(itemDetailsRepository.save(itemDetails)).thenReturn(itemDetails);
		// Act
		itemDetailsService.addItemDetails(itemDetails);
		// Assert
		verify(itemDetailsRepository, times(1)).save(itemDetails);
	}
}
