package com.xworkz.map2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BarBrandMapEstablisher {

	
	public static void main(String[] args) {
		
		Map<String,Integer> barMap= new TreeMap<String,Integer>((a1,a2)->a2.compareTo(a1));
		
		barMap.put("Toit", 8);
		barMap.put("Watsons, Ulsoor",9);
		barMap.put("Monkey Bar", 7);
		barMap.put("Skyye", 6);
		barMap.put("Prost Brew Pub",10);
		barMap.put("Pecos Stones", 20);
		barMap.put("Hoppipola",30);
		barMap.put("B-Hive",25);
		barMap.put("District6", 28);
		barMap.put("Manjunath",35);
		
		
		System.out.println(barMap.size());
		System.out.println("=================================");
		
		
		
	   Set<String> key=barMap.keySet();
	   key.forEach((k)->System.out.println(k));
		System.out.println("=================================");
		
		
		
		Collection<Integer> values=barMap.values();
		values.forEach((n)->System.out.println(n));
		System.out.println("=================================");
		
		
		Set<Map.Entry<String, Integer>> b= barMap.entrySet();
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
