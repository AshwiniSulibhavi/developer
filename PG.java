package com.xworkz.dao.pg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PG {
	
	
	
private Collection<String> pgNameCollection=new ArrayList<String>();
	
	public boolean save(String name) {
		Iterator itr=pgNameCollection.iterator();
		   while(itr.hasNext()) {
			   String tempName=(String)itr.next();
			 }
		return pgNameCollection.add(name);	
	}
	
	public boolean find(String name) {
		 Iterator<String> itr= pgNameCollection.iterator();
		 while(itr.hasNext()) {
			 String tempName=itr.next();
			 if(tempName.equals(name)) {
				 return true;
			 }
		return pgNameCollection.contains(name);
		 }
		 return false;
		
	}
	
	public boolean findByCaseInSensitive(String name) {
		Iterator <String> itr=pgNameCollection.iterator();
		    while(itr.hasNext()) {
		    	String tempName=itr.next();
		    	if(tempName.equalsIgnoreCase(name)) {
		    		return true;
		    	}
		    }
		return false;
	}
	
	public boolean findByCaseInSensitiveAndTrimmed(String name) {
		Iterator <String> itr=pgNameCollection.iterator();
	    while(itr.hasNext()) {
	    	String tempName=itr.next();
	    	if(tempName.trim()!=null) {
	    		return true;
	    	}
		
	   }
		return false;
	
	}	

}
