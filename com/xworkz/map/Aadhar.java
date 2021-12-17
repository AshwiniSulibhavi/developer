package com.xworkz.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Aadhar{

	public static void main(String[] args) {
		
	
	Map map= new HashMap();
	
	map.put("Ashwini",321145667899L);
	map.put("Asha",456232567895L);
	map.put("Annakarmel",789456245234L);
	map.put("Lakshmi",456612352564L);
	map.put("Pooja",546425212336L);
	map.put("Shubha",623245614235L);
	
    System.out.println(map.size());
    
    
  System.out.println("Asha");
    
    
    boolean contains=map.containsKey("Ashwini");
    System.out.println(contains);
    
    
    contains=map.containsValue(623245614235L);
    System.out.println(contains);
    
   

    
    Set<String> v= map.keySet();
    
    v.forEach((d)->{
    	System.out.println(d);
    	
    	
    });
}
}
