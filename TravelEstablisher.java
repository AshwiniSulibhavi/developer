package com.xworkz.cloning.application;

public class TravelEstablisher {

	
	
	public static void main(String a[]) throws CloneNotSupportedException {
		
		
		Travel bus=new Travel();
		bus.setTravelAgencyName("VRL Agency");
		bus.setCost(800);
		bus.setBusNumber("KA-15-C-7852");
		bus.setSeatNumber(10);
		bus.setTravelAgencyNumber(5);
		
		
		Travel obj=(Travel)bus.clone();
		System.out.println(bus.getTravelAgencyName());
		System.out.println(bus.getBusNumber());
		System.out.println(bus.getCost());
		System.out.println(bus.getSeatNumber());
		System.out.println(bus.getTravelAgencyNumber());
		
		

	}

}
