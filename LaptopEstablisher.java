package com.xworkz.cloning.application;

public class LaptopEstablisher {

	
	
	
public static void main (String[] args) throws CloneNotSupportedException {
		
		Laptop laptop = new Laptop();
		laptop.setName("Lenovo");
		laptop.setId(130);
		laptop.setPrice(30000);
		laptop.setRam(4);
		laptop.setGeneration("3rd");
		
		Laptop laptopCopy = (Laptop) laptop.clone();
		
		System.out.println(laptop.getName());
		System.out.println(laptop.getId());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getRam());
		System.out.println(laptop.getGeneration());
	}

}
