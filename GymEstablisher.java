package com.xworkz.dao.gym;

public class GymEstablisher {
	
	
	
	public static void main(String[] args) {
		
		String gymName="Vinayak Gym";
		gymName=gymName.replace("","");
		System.out.println(gymName);
		
		Gym dao=new Gym();
		dao.save("Prabhu Gym");
		dao.save(" Anytime Gym");
		dao.save("Planet Fitness");
		
		boolean found=dao.find("PowerHouse gym");
		System.out.println(found);
		
		found=dao.findByCaseInsensitive("Dragon Gym");
		System.out.println(found);
		
		found=dao.findByCaseInsensitiveAndTrimmed("Aspire Fitness");
		System.out.println(found);
		
	}
	}

