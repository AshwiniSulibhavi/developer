package com.xworkz.hotelapp.dto;

public class HotelDTO {
	
	private String hotelName;
	private int hotelHygine;
	private  int hotelCost;
	private String hotelPlace;
	
	
	public HotelDTO(){
		System.out.println(this.getClass().getSimpleName()+"object is created");

	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public int getHotelHygine(){
		return hotelHygine;
	}


	public void setHotelHygine(int hotelHygine) {
		this.hotelHygine = hotelHygine;
	}


	public int getHotelCost() {
		return hotelCost;
	}


	public void setHotelCost(int hotelCost) {
		this.hotelCost = hotelCost;
	}


	public String getHotelPlace() {
		return hotelPlace;
	}


	public void setHotelPlace(String hotelPlace) {
		this.hotelPlace = hotelPlace;
	}


	@Override
	public String toString() {
		return "HotelDTO [hotelName=" + hotelName + ", hotelhygine=" + hotelHygine + ", hotelCost=" + hotelCost + ", hotelPlace="
				+ hotelPlace + "]";
	}
	
	
	
	
}

	