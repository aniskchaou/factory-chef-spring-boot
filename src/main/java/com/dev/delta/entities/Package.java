package com.dev.delta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Package {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	String Title;
	String Description;
	String Price;
	String PromoPrice;
	String Type;
	String Days;
	String Expiration;
	String Number;
	String numberOfItem;
	String Status;
	public Package(String title, String description, String price, String promoPrice, String type, String days,
			String expiration, String number, String numberOfItem, String status) {
		super();
		Title = title;
		Description = description;
		Price = price;
		PromoPrice = promoPrice;
		Type = type;
		Days = days;
		Expiration = expiration;
		Number = number;
		this.numberOfItem = numberOfItem;
		Status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getPromoPrice() {
		return PromoPrice;
	}
	public void setPromoPrice(String promoPrice) {
		PromoPrice = promoPrice;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getDays() {
		return Days;
	}
	public void setDays(String days) {
		Days = days;
	}
	public String getExpiration() {
		return Expiration;
	}
	public void setExpiration(String expiration) {
		Expiration = expiration;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getNumberOfItem() {
		return numberOfItem;
	}
	public void setNumberOfItem(String numberOfItem) {
		this.numberOfItem = numberOfItem;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
