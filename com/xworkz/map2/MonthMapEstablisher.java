package com.xworkz.map2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MonthMapEstablisher {
	
	public static void main(String[] args) {
		
		
		Map<String,Integer> monthMap=new TreeMap<String,Integer>((a1,a2)->a2.compareTo(a1));
		
		
		monthMap.put("January", 31);
		monthMap.put("February",28);
		monthMap.put("March", 31);
		monthMap.put("April", 30);
		monthMap.put("May", 31);
		monthMap.put("June",30);
		monthMap.put("July", 31);
		monthMap.put("August",31);
		monthMap.put("September",30);
		monthMap.put("October",31);
		
			
			
			
			System.out.println(monthMap.size());
			System.out.println("=================================");
			
			
			
		   Set<String> key=monthMap.keySet();
		   key.forEach((k)->System.out.println(k));
			System.out.println("=================================");
			
			
			
			Collection<Integer> values=monthMap.values();
			values.forEach((n)->System.out.println(n));
			System.out.println("=================================");
			
			
			Set<Map.Entry<String, Integer>> b= monthMap.entrySet();
			b.forEach((h)->System.out.println(h));
		
			
		   
			Iterator<Map.Entry<String,Integer>> itr= b.iterator();
			System.out.println("============================");
			while(itr.hasNext()) {
				Map.Entry<String, Integer> entry=itr.next();
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				


		
		
			}
		
	}

}
