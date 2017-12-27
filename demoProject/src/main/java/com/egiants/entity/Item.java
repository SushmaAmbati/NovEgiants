package com.egiants.entity;

import java.io.Serializable;
import javax.persistence.JoinColumn;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item implements Serializable {

	@Id
	@Column(name = "item_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "brand_id")
	private Long brandId;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "price")
	private BigDecimal price;

	@ManyToMany
	@JoinTable(name = "products_items", joinColumns = { @JoinColumn(name = "PI_ITEM_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "PI_PRODUCT_ID") })
	private Set<Product> products;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Long itemId, String itemName, Long brandId, Long productId, BigDecimal price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.brandId = brandId;
		this.productId = productId;
		this.price = price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
