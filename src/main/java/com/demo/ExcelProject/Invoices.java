package com.demo.ExcelProject;

import java.util.Date;

public class Invoices {
	Integer itemId;
	String itemName;
	Integer itemQty;
	Double totalPrice;
	Date itemSoldDate;
	public Invoices(Integer itemId, String itemName, Integer itemQty, Double totalPrice, Date itemSoldDate) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.totalPrice = totalPrice;
		this.itemSoldDate = itemSoldDate;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemQty() {
		return itemQty;
	}
	public void setItemQty(Integer itemQty) {
		this.itemQty = itemQty;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getItemSoldDate() {
		return itemSoldDate;
	}
	public void setItemSoldDate(Date itemSoldDate) {
		this.itemSoldDate = itemSoldDate;
	}
	

}
