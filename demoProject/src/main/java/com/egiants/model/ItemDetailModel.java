package com.egiants.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.egiants.groups.CreateOrUpdateValidation;
import com.egiants.groups.CreateValidation;
import com.egiants.groups.UpdateValidation;

public class ItemDetailModel {
	@NotNull(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class })
	private Long itemId;

	@NotNull(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class })
	@Size(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class }, max = 1000)
	private String itemDescription;

	@NotNull(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class })
	@Size(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class }, max = 1000)
	private String specification;

	@NotNull(groups = { CreateValidation.class, UpdateValidation.class })
	private Long stock;

	@NotNull(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class })
	private BigDecimal price;
	
	@NotNull(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class })
	@Size(groups = { CreateValidation.class, UpdateValidation.class, CreateOrUpdateValidation.class }, max = 1000)
	private Long itemBrandId;

	public ItemDetailModel() {

	}

	public ItemDetailModel(Long itemId, String itemDescription, String specification, Long stock, BigDecimal price, Long itemBrandId) {
		super();
		this.itemId = itemId;
		this.itemDescription = itemDescription;
		this.specification = specification;
		this.stock = stock;
		this.price = price;
		this.itemBrandId = itemBrandId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getItemBrandId() {
		return itemBrandId;
	}

	public void setItemBrand(Long itemBrandId) {
		this.itemBrandId = itemBrandId;
	}

}
