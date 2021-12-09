package com.xworkz.dao.email;

public class EmailSearchByMail implements EmailSearch {

	
	public boolean expression(String arg1, String arg2) {
		if(arg1.equals(arg2)) {
		
		return true;
	}
		return false;
	
	

}
}
