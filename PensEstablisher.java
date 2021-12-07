package com.xworkz.cloning.application;

public class PensEstablisher {
	
	
	public static void main(String a[]) throws CloneNotSupportedException {
		
	    Pens pen=new Pens();
		
		pen.setColour("black");
		pen.setCost(100);
		pen.setName("Renolods pen");
		pen.setNoOfPens(5);
		pen.setType("Gel pen");
		
		Pens pen1=(Pens)pen.clone();
		System.out.println(pen.getColour());
		System.out.println(pen.getCost());
		System.out.println(pen.getName());
		System.out.println(pen.getNoOfPens());
		System.out.println(pen.getType());


	}


}
