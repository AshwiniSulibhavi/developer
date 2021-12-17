package com.xworkz.map;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;
	public class Keyboard {



		public static void main(String[] args) {
			
		
		Map map=(Map) new HashMap();
		
	    map.put("Windows",104);
	    map.put("Apple",109);
	    map.put("MacBook",78);
	    map.put("AT Enchanced",101);

		
	    System.out.println(map.size());
	    
	    
	    Integer value= (Integer)map.get("MacBook");
	    
	    
	    boolean contains=map.containsKey("Apple");
	    System.out.println(contains);

	    
	    Set<String> v= map.keySet();
	    
	    v.forEach((d)->{
	    	System.out.println(d);
	    	
	    	
	    });
	}
	}



