package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Continent {
	public static void main(String[] args) {
		
		Map map=new HashMap();
		
		map.put("Africa",54);
		map.put("Asia",49);
		map.put("Europe",51);
		map.put("North America", 23);
		map.put("Oceania and Australia", 14);
		map.put("South America", 12);
		
		
		System.out.println(map.size());
		
       Integer value = (Integer) map.get(49);
		
		
		boolean contains= map.containsKey("Asia");
		System.out.println(contains);
		
		
		@SuppressWarnings("unchecked")
		Set<String> keys= map.keySet();
		
		
		keys.forEach((a)->{
			
			System.out.println(a);
		});
		
	}

}
