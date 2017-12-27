package com.egiants.service;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.egiants.dao.ItemRepository;
import com.egiants.entity.Item;
import com.egiants.service.ItemService;

public class ItemServiceTest {

	private ItemService itemService;
	@Mock
	private ItemRepository itemRepository;
	@Mock
	private Iterable<Item> items;

	@Mock
	private Item item;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
		itemService = new ItemService();

		itemService.setItemRepository(itemRepository);
	}

	@Test
	public void testMockCreation() {
		assertNotNull(itemService);
		assertNotNull(itemRepository);
		assertNotNull(item);
		assertNotNull(items);
	}

	@Test
	public void shouldReturnItem_whenGetItemByIdIsCalled() throws Exception {
		// Arrange
		when(itemRepository.findOne((long) 1)).thenReturn(item);
		// Act
		Item retrievedProduct = itemService.getItem((long) 1);
		// Assert
		assertThat(retrievedProduct, is(equalTo(item)));
	}

	@Test
	public void itemSaved_whenSaveItemIsCalled() throws Exception {
		// Arrange
		when(itemRepository.save(item)).thenReturn(item);
		// Act
		itemService.addItem(item);
		// Assert
		verify(itemRepository, times(1)).save(item);
	}

	@Test
	public void shouldCallDeleteMethodOfItemRepository_whenDeleteItemIsCalled() throws Exception {
		// Arrange
		doNothing().when(itemRepository).delete((long) 5);
		ItemRepository my = Mockito.mock(ItemRepository.class);
		// Act
		itemService.deleteItem((long) 5);
		// Assert
		verify(itemRepository, times(1)).delete((long) 5);
	}

	@Test
	public void shouldReturnAllItems_whenGetAllItemsIsCalled() throws Exception {
		// Arrange
		when(itemRepository.findAll()).thenReturn(items);
		// Act
		Iterable<Item> retrieveditems = itemService.getAllItems();
		// Assert
		assertThat(retrieveditems, is(equalTo(items)));
	}

	@Test
	public void itemSaved_whenSaveItemIsCalledOnExistingItem() throws Exception {
		// Arrange
		when(itemRepository.save(item)).thenReturn(item);
		// Act
		itemService.updateItem("3", item);
		// Assert
		verify(itemRepository, times(1)).save(item);
	}
}
