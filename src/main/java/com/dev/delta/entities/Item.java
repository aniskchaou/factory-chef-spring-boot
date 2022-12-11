package com.dev.delta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	String Menu ;
	String ItemName ;
	String Itemprice ;
	String ItemType ;
	String Addons ;
	String Description ;
	String ItemImage ;
	String Status ;
	public Item(String menu, String itemName, String itemprice, String itemType, String addons, String description,
			String itemImage, String status) {
		super();
		Menu = menu;
		ItemName = itemName;
		Itemprice = itemprice;
		ItemType = itemType;
		Addons = addons;
		Description = description;
		ItemImage = itemImage;
		Status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMenu() {
		return Menu;
	}
	public void setMenu(String menu) {
		Menu = menu;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getItemprice() {
		return Itemprice;
	}
	public void setItemprice(String itemprice) {
		Itemprice = itemprice;
	}
	public String getItemType() {
		return ItemType;
	}
	public void setItemType(String itemType) {
		ItemType = itemType;
	}
	public String getAddons() {
		return Addons;
	}
	public void setAddons(String addons) {
		Addons = addons;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getItemImage() {
		return ItemImage;
	}
	public void setItemImage(String itemImage) {
		ItemImage = itemImage;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
