package com.egiants.coverter;

import com.egiants.entity.Item;
import com.egiants.entity.ItemDetails;
import com.egiants.model.ItemDetailModel;
import com.egiants.model.ItemModel;

public class ItemDetailsConverter {
	public ItemDetails convertModelToEntity(ItemDetailModel idm) {
		ItemDetails itemDetail = new ItemDetails();
		if (idm != null) {
			if (idm.getItemId() != null)
				itemDetail.setItemId(idm.getItemId());
			if (idm.getItemDescription() != null)
				itemDetail.setItemDescription(idm.getItemDescription());
//			if (idm.getItemBrandId() != null)
//				itemDetail.setItemBrandId(idm.getItemBrandId());
		}
		return itemDetail;

	}

	public ItemDetailModel convertEntityToModel(ItemDetails itemDetails) {
		ItemDetailModel idm = new ItemDetailModel();
		if (itemDetails != null) {
			if (itemDetails.getItemId() != null)
				idm.setItemId(itemDetails.getItemId());
			if (itemDetails.getItemDescription() != null)
				idm.setItemDescription(idm.getItemDescription());
//			if (itemDetails.getItemBrand() != null)
//				idm.setItemBrand(idm.getItemBrandId());
		}
		return idm;

	}
}
