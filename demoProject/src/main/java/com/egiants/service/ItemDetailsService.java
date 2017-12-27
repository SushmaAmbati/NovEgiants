package com.egiants.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egiants.dao.ItemDetailsRepository;
import com.egiants.dao.ItemRepository;
import com.egiants.entity.Item;
import com.egiants.entity.ItemDetails;
@Service
public class ItemDetailsService {
	@Autowired
	private ItemDetailsRepository itemDetailsRepository;
	
	@Autowired
	public void setItemDetailsRepository(ItemDetailsRepository itemDetailsRepository) {
		this.itemDetailsRepository = itemDetailsRepository;
	}

	
	public ItemDetails getItemDetails(Long id) {
		if (itemDetailsRepository.findOne(id) != null)
			return itemDetailsRepository.findOne(id);
		else
			return null;
	}
	
	public void updateItemDetails(String id, ItemDetails itemDetails) {
		itemDetailsRepository.save(itemDetails);
	}
	
	public void addItemDetails(ItemDetails itemDetails) {
		itemDetailsRepository.save(itemDetails);
	}

}
