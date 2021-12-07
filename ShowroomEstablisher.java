package com.xworkz.cloning.application;

public class ShowroomEstablisher {
	
	

		
		public static void main(String[] args) throws CloneNotSupportedException {
			
			Showroom showroom = new Showroom();
			showroom.setName(null);
			showroom.setLocation(null);
			showroom.setItemName(null);
			showroom.setItemPrice(0);
			
			Showroom obj = (Showroom) showroom.clone();
			System.out.println(showroom.getName());
			System.out.println(showroom.getLocation());
			System.out.println(showroom.getItemName());
			System.out.println(showroom.getItemPrice());
		}


}
