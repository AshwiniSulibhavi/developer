package com.xworkz.map2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class State {

	public static void main(String[] args) {
		
		Map<String, Integer> stateMap= new HashMap();
		
		stateMap.put("ANDHRA PRADESH",13 );
		stateMap.put("ASSAM",33 );
		stateMap.put("BIHAR",38 );
		stateMap.put("CHANDIGARH",1 );
		stateMap.put("DELHI",11 );
		stateMap.put("GOA",2 );
		stateMap.put("GUJARAT",33 );
		stateMap.put("HARYANA",22 );
		stateMap.put("KARNATAKA",31 );
		stateMap.put("KERALA",14 );
		
		System.out.println(stateMap.size());
		System.out.println("==============================");
		
		
		Set<String> set= stateMap.keySet();
		
		set.forEach((r)->System.out.println(r));
		
		System.out.println("==============================");
		
		
		
		Collection<Integer> values=stateMap.values();
		values.forEach((k)->System.out.println(k));
		System.out.println("==============================");
		
		
		Set<Map.Entry<String, Integer>> entrySet=stateMap.entrySet();
		entrySet.forEach((entry)->System.out.println(entry));
		
		
		
		Iterator<Map.Entry<String,Integer>> itr= entrySet.iterator();
		System.out.println("============================");
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry=itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
			
		}
		
		
	}
	
}
