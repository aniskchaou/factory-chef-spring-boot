package com.dev.delta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Offer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	String OfferName;
	String Offerprice;
	String OfferStartDate;
	String OfferValidDate;
	String OfferImageName;
	String OfferConditions;
	String Status;
	String MenuName;
	String ItemName;
	String Quantity;
	public Offer(String offerName, String offerprice, String offerStartDate, String offerValidDate,
			String offerImageName, String offerConditions, String status, String menuName, String itemName,
			String quantity) {
		super();
		OfferName = offerName;
		Offerprice = offerprice;
		OfferStartDate = offerStartDate;
		OfferValidDate = offerValidDate;
		OfferImageName = offerImageName;
		OfferConditions = offerConditions;
		Status = status;
		MenuName = menuName;
		ItemName = itemName;
		Quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOfferName() {
		return OfferName;
	}
	public void setOfferName(String offerName) {
		OfferName = offerName;
	}
	public String getOfferprice() {
		return Offerprice;
	}
	public void setOfferprice(String offerprice) {
		Offerprice = offerprice;
	}
	public String getOfferStartDate() {
		return OfferStartDate;
	}
	public void setOfferStartDate(String offerStartDate) {
		OfferStartDate = offerStartDate;
	}
	public String getOfferValidDate() {
		return OfferValidDate;
	}
	public void setOfferValidDate(String offerValidDate) {
		OfferValidDate = offerValidDate;
	}
	public String getOfferImageName() {
		return OfferImageName;
	}
	public void setOfferImageName(String offerImageName) {
		OfferImageName = offerImageName;
	}
	public String getOfferConditions() {
		return OfferConditions;
	}
	public void setOfferConditions(String offerConditions) {
		OfferConditions = offerConditions;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getMenuName() {
		return MenuName;
	}
	public void setMenuName(String menuName) {
		MenuName = menuName;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	
	
}
