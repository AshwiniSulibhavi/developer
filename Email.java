package com.xworkz.dao.email;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Email {
	
	
	
 Collection<String> emailCollection=new ArrayList<String>();
	
	public boolean save(String id) {
		Iterator itr=emailCollection.iterator();
		  return emailCollection.add(id);	
	}
	
	public boolean find(EmailSearch search, String id) {
		 Iterator<String> itr= emailCollection.iterator();
		 while(itr.hasNext()) {
			 String tempName=itr.next();
			 if(search.equals(tempName)) {
				 return true;
			 }
		return emailCollection.contains(id);
		 }
		 return false;
		
	}


}
