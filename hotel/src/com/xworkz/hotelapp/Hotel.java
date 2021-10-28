package com.xworkz.hotelapp;

import com.xworkz.hotelapp.dto.HotelDTO;

public class Hotel {
	
	private HotelDTO[] hotel;
	private int index;
	
	public Hotel(int size) {
		hotel=new HotelDTO[size];
	}
	
	public boolean createHotel(HotelDTO hotel) {
		boolean HotelAdded= false;
		System.out.println("inside create hotel method");
		
		if (hotel!=null) {
			this.hotel[index++]=hotel;
			HotelAdded=true;
			
		}else {
		System.out.println("no hotel is available");
		return HotelAdded=false;
		
	}
	return HotelAdded;
}

public boolean updateHotelHygineByCost(int cost, int hygine) {
	System.out.println("inside the update HotelByCost");
	boolean update=false;
	
	if(cost>0&& hygine>0) {
		for(int i=0;i<hotel.length;i++) {
			if(hotel[i].getHotelCost()==cost) {
				System.out.println("cost is found , now update the hygine"+"  "+cost+"  "+hygine);
				hotel[i].setHotelHygine(hygine);
				update=true;
			}
			else
				System.out.println("cost is found, now update the hygine");
			update=false;
			
			}
		}
	
	return update;
	}

public HotelDTO getHotelByName(String hotelName) {
	HotelDTO dto = null;
	if(hotelName!=null) {
		for(int i=0;i<hotel.length;i++) {
			if(hotel[i].getHotelName().equals(hotelName)) {
				System.out.println("hotel name is :"+hotelName);
				dto=hotel[i];
				
			}
			else 
				System.out.println("Hotel name no found");
		}
	}
	return dto;
}
	
	public HotelDTO getHotelByPlace(String hotelPlace) {
		HotelDTO dto = null;
		if(hotelPlace!=null) {
			for(int i=0;i<hotel.length;i++) {
				if(hotel[i].getHotelPlace().equals(hotelPlace)) {
					System.out.println("hotel place is :"+hotelPlace);
					dto=hotel[i];
					
				}
				else
					System.out.println("Hotel place not found");
			}
		}
		return dto;
	}
	
	public HotelDTO getHotelByCost(int hotelCost) {
		HotelDTO dto = null;
		if(hotelCost!=0) {
			for(int i=0;i<hotel.length;i++) {
				if(hotel[i].getHotelCost()==(hotelCost)) {
					System.out.println("hotel cost is :"+hotelCost);
					dto=hotel[i];
					
				}
				else
					System.out.println("Hotel cost not found");
			}
		}
		return dto;
	}

public void deleteHotelByCost(int hotelCost) {
	System.out.println("inside delete hotel by cost()");
	
	if(hotelCost!=0) {
		for(int i=0;i<hotel.length;i++) {
			
			if(hotel[i].getHotelCost()==(hotelCost)) {
				System.out.println("Hotel deleted by Cost :"+hotelCost);
				hotel[i].setHotelCost(hotelCost);
				
			}
			else {
				System.out.println("hotel is not deleted");
			}
		}
	}
}

}
