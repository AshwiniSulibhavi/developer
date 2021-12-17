package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Laptop {
	
	public static void main(String[] args) {
		Map map=new HashMap();
		
		map.put("Lenovo", 12456 );
		map.put("Hp",34521);
		map.put("Acer", 435261);
		map.put("Apple",763653);
		map.put("Dell",562352);
		
		
		System.out.println(map.size());
		
		Integer value = (Integer) map.get("Dell");
		
		
		boolean contains= map.containsKey("acer");
		System.out.println(contains);
		
		
		Set<String> keys= map.keySet();
		
		
		keys.forEach((a)->{
			
			System.out.println(a);
		});
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
