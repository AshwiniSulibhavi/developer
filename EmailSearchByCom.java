package com.xworkz.dao.email;

public class EmailSearchByCom implements EmailSearch {

	
	public boolean expression(String arg1, String arg2) {
		
		
		String str=arg1.substring(arg1.length()-3,arg1.length());
		
		if(arg1.equalsIgnoreCase(arg2)) {
		return true;
	}
		return false; 
	
	
	
	

}
}
