package com.xworkz.map2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MoviesMapEstablisher {
	
	
	public static void main(String[] args) {
		
		
		Map<String,Integer> moviesMap=new TreeMap<String,Integer>((a1,a2)->a2.compareTo(a1));
		
		
	moviesMap.put("Garuda Gamana Vrishabha Vahana", 5);
	moviesMap.put("tom and Jerry", 4);
    moviesMap.put("Premam Poojyam", 5);
    moviesMap.put("salaga", 4);
    moviesMap.put("Kotigobba 3", 5);
    moviesMap.put("Puksatte Lifu", 5);
    moviesMap.put("Drishya 2", 4);
	moviesMap.put("Roberrt", 5);
    moviesMap.put("Ninna Sanihake", 2);
    moviesMap.put("Bhajarangi 2", 3);

		
		
		
		System.out.println(moviesMap.size());
		System.out.println("=================================");
		
		
		
	   Set<String> key=moviesMap.keySet();
	   key.forEach((k)->System.out.println(k));
		System.out.println("=================================");
		
		
		
		Collection<Integer> values=moviesMap.values();
		values.forEach((n)->System.out.println(n));
		System.out.println("=================================");
		
		
		Set<Map.Entry<String, Integer>> b= moviesMap.entrySet();
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
