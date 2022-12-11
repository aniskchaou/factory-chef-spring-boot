package com.dev.delta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	String OrderNo;
	String OrderDate;
	String OrderTime;
	String DeliveryCost;
	String OrderCost;
	String PaidAmount;
	String BookedDate;
	String Status;
	String CustomerName;
	String Phone;
	String HouseNumber;
	String Street;
	String Landmark;
	String Locality;
	String City;
	String Zipcode;
	String Items;
	String ItemName;
	public Order(String orderNo, String orderDate, String orderTime, String deliveryCost, String orderCost,
			String paidAmount, String bookedDate, String status, String customerName, String phone, String houseNumber,
			String street, String landmark, String locality, String city, String zipcode, String items,
			String itemName) {
		super();
		OrderNo = orderNo;
		OrderDate = orderDate;
		OrderTime = orderTime;
		DeliveryCost = deliveryCost;
		OrderCost = orderCost;
		PaidAmount = paidAmount;
		BookedDate = bookedDate;
		Status = status;
		CustomerName = customerName;
		Phone = phone;
		HouseNumber = houseNumber;
		Street = street;
		Landmark = landmark;
		Locality = locality;
		City = city;
		Zipcode = zipcode;
		Items = items;
		ItemName = itemName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getOrderTime() {
		return OrderTime;
	}
	public void setOrderTime(String orderTime) {
		OrderTime = orderTime;
	}
	public String getDeliveryCost() {
		return DeliveryCost;
	}
	public void setDeliveryCost(String deliveryCost) {
		DeliveryCost = deliveryCost;
	}
	public String getOrderCost() {
		return OrderCost;
	}
	public void setOrderCost(String orderCost) {
		OrderCost = orderCost;
	}
	public String getPaidAmount() {
		return PaidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		PaidAmount = paidAmount;
	}
	public String getBookedDate() {
		return BookedDate;
	}
	public void setBookedDate(String bookedDate) {
		BookedDate = bookedDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		HouseNumber = houseNumber;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getLandmark() {
		return Landmark;
	}
	public void setLandmark(String landmark) {
		Landmark = landmark;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	
	
}
