package com.xworkz.dto;

public class CountryDTO {
	
	private int countryId;
	private String countryName;
	private  StateDTO state;
	
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "CountryDTO-{countryId=" +this.countryId + ", countryName=" +this.countryName + "}";
	}
	
	
	
	

}
