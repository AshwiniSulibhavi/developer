package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlanS {
	public static void main(String[] args) {
		
		Map  map = new HashMap();
		
		map.put("Mercury",0);
		map.put("Venus",0);
		map.put("Earth",1);
		map.put("Mars",2);
		map.put("Jupiter",79);
		map.put("Saturn",82);
		map.put("Uranus",27);
		map.put("Neptune",14);
		
		
		System.out.println(map.size());
		
		
		Integer value=(Integer)map.get("Earth");
		
		boolean contains=map.containsKey("Mars");
		System.out.println(contains);
		
		
		Set<String> keys=map.keySet();
		
		keys.forEach((m)->{
			System.out.println(m);
			
			
		});
	}

}
