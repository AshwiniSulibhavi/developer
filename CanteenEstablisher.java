package com.xworkz.cloning.application;

public class CanteenEstablisher {
	

		public static void main(String a[]) throws CloneNotSupportedException {
		
		Canteen can= new Canteen();
		
		can.setCanteenName("Indira Canteen");
		
		can.setCanteenLocation("Rajajinagar");
		can.setContactNo(6364070363L);

		can.setIteam("Paratha& Dal");
		can.setIteamCost(35);
		
		Canteen can1=(Canteen)can.clone();
		
		
		System.out.println(can.getCanteenName());
		System.out.println(can.getCanteenLocation());
	System.out.println(can.getContactNo());
	System.out.println(can.getIteam());
	System.out.println(can.getIteamCost());

	}

}
