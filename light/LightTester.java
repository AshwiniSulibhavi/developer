package com.xworkz.lightApp;
import java.util.Scanner;
public class LightTester {
	
	public static void main(String a[]) {
	Scanner type=new Scanner(System.in);
	System.out.println("enter the light");
	
	
	ISwitch iSwitch= LightFactory.getLight(type.next());
	  if (iSwitch!=null)
	  {
		  iSwitch.sOff();
		  iSwitch.sOn();
	  }
	}
}


