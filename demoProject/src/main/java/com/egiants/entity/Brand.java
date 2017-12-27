package com.egiants.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
	@Column(name = "brand_id")
	private Long brandId;

	@Column(name = "brand_name")
	private String brandName;

	
	private String brandDescription;

	@Column(name = "brand_createdate")
	private Date brandCreateDate;

	@OneToMany
	private Set<Item> items;

	@OneToMany
	private Set<ItemDetails> itemDetails;
	
	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public Brand(Long brandId, String brandName, String brandDescription, Date brandCreateDate, Set<Item> items, Set<ItemDetails> itemDetails) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandDescription = brandDescription;
		this.brandCreateDate = brandCreateDate;
		this.items = items;
		this.itemDetails = itemDetails;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public Date getBrandCreateDate() {
		return brandCreateDate;
	}

	public void setBrandCreateDate(Date brandCreateDate) {
		this.brandCreateDate = brandCreateDate;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
