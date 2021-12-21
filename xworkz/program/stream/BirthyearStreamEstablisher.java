package com.xworkz.program.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthyearStreamEstablisher {

	public static void main(String[] args) {
		
		Stream<Integer> birthyearStream=Stream.of(1999,1997,1999,2000,2001,1998,1994,1995,1995,1890,2012,2000,1996,1993,1999,1994,1996,1994,2002,2003,2000);
		
	    //Set<Integer> y=birthyearStream.filter((year)->year>1999).sorted().collect(Collectors.toSet());
	  //  y.forEach((p)->System.out.println(p));
	    
	    
	   List<Integer> y=birthyearStream.filter((year)->year>1999).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    y.forEach((p)->System.out.println(p));
	    
	}
	
}
