package com.xworkz.lightApp;

public class LightFactory {
	
	
	public static ISwitch getLight(String type) {
		if(type.equals("tubelight")) {
			return new TubelightImpl();
			
		}
		else if(type.equals("CflBulb")) {
			return new CflBulbImpl();
		}
		else {
			System.out.println("Light is not found...");
		}
		return null;
	}

}
