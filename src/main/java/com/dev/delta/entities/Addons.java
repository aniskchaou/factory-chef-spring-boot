package com.dev.delta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Addons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	String AddonName ;
	String Price ;
	String Description ;
	String AddonImage ;
	String Status ;
	public Addons(String addonName, String price, String description, String addonImage, String status) {
		super();
		AddonName = addonName;
		Price = price;
		Description = description;
		AddonImage = addonImage;
		Status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddonName() {
		return AddonName;
	}
	public void setAddonName(String addonName) {
		AddonName = addonName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getAddonImage() {
		return AddonImage;
	}
	public void setAddonImage(String addonImage) {
		AddonImage = addonImage;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
