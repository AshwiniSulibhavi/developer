package com.xworkz.map2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class AreaMapEstablisher {
	public static void main(String[] args) {
		
		
		Map<String,Integer>  areaMap =new TreeMap<String,Integer> ((a1,a2)->a2.compareTo(a1));
		
		areaMap.put("Khushi pg",78000);
		areaMap.put("Manti square",8050);
		areaMap.put("TajMahal", 10000);
		areaMap.put("KutubMinnar",84500 );
		areaMap.put("BurjKalifa",9520);
		areaMap.put("Orien Mall",99520 );
		areaMap.put("pattadkallu",74000);
		areaMap.put("Aihole",80350);
		areaMap.put("Pub",54000);
		areaMap.put("Mardimatha",81500 );
		
		
		System.out.println(areaMap.size());
		System.out.println("=================================");
		
		
		
	   Set<String> key=areaMap.keySet();
	   key.forEach((k)->System.out.println(k));
		System.out.println("=================================");
		
		
		
		Collection<Integer> values=areaMap.values();
		values.forEach((n)->System.out.println(n));
		System.out.println("=================================");
		
		
		Set<Map.Entry<String, Integer>> b= areaMap.entrySet();
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
