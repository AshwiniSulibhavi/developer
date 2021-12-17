package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConPin {
	public static void main(String[] args) {
		
		Map map= new HashMap();
		
		map.put("India",15216 );
		map.put("France",52727 );
		map.put("Germany",16482 );
		map.put("Italy",19938 );
		map.put("Japan",94378 );
		map.put("Indonesia",86554 );
		map.put("Mexico",75203 );
		
		
		System.out.println(map.size());
		
		
		Integer value= (Integer)map.get("India");
		
		boolean contains=map.containsKey("Mexicos");
	    System.out.println(contains);
	    
	    Set<String> k= map.keySet();
	    
	  k.forEach((g)->{
		  System.out.println(g);
	  });
	
	
	
	}

}
