package com.egiants.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_detail")
public class ItemDetails implements Serializable {

	public ItemDetails() {

	}

	@Id
	@Column(name = "item_id")
	private Long itemId;

	@Column(name = "item_description")
	private String itemDescription;

	@Column(name = "specification")
	private String specification;

	@Column(name = "stock")
	private Long stock;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "item_brand")
	private String itemBrand;

	@Column(name = "item_brandId")
	private String itemBrandId;
	
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

	public String getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
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

	public ItemDetails(Long itemId, String itemDescription, String specification, Long stock, BigDecimal price,
			String itemBrand) {
		super();
		this.itemId = itemId;
		this.itemDescription = itemDescription;
		this.specification = specification;
		this.stock = stock;
		this.price = price;
		this.itemBrand = itemBrand;
	}

}