package com.xworkz.cloning.application;

public class BottelEstablisher {
	
	
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Bottel bt = new Bottel();
		bt.setName("H2O");
		bt.setPrice(60);
		bt.setColor("Blue");
	    bt.setBrand("Plastic Bottel");
	    
	    Bottel bt1 = (Bottel) bt.clone();
	    
	    System.out.println(bt.getName());
	    System.out.println(bt.getPrice());
	    System.out.println(bt.getColor());
	    System.out.println(bt.getBrand());
	

}


}
