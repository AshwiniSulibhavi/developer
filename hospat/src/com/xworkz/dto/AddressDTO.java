package com.xworkz.dto;

public class AddressDTO {
	
	private int addressId;
	
	private CountryDTO country;
	
	
	

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	public String toString() {
		return "AddressDTO-{addressId="+this.addressId+"}";
	}
	
	

}

