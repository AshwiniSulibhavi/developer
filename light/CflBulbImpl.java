package com.xworkz.lightApp;

public class CflBulbImpl implements ISwitch {

	@Override
	public void sOn() {
		System.out.println("CflBulb is turned on..");
		
	}

	@Override
	public void sOff() {
		System.out.println("CflBulb is turned off..");
		
	}

}
