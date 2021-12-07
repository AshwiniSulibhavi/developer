package com.xworkz.cloning.application;

public class Showroom implements Cloneable{

	
	
	private String name;
	private String location;
	private String itemName;
	private int itemPrice;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	


}
