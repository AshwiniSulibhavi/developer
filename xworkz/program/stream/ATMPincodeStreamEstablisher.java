package com.xworkz.program.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ATMPincodeStreamEstablisher {
	
	public static void main(String[] args) {
		
		Stream<Integer> atmpinStream= Stream.of(9626,1423,0550,0203,4526,0412,7845,9635,1562,1489,0632,0777,0070,0036,1254,6523,3657,5210,7530);
		List<Integer> u=atmpinStream.filter((e)->e>1000).sorted().collect(Collectors.toList());
		u.forEach((q)->System.out.println(q));
		
		
		
		//Stream<Integer> atmpinStream= Stream.of(9626,1423,0550,0203,4526,0412,7845,9635,1562,1489,0632,0777,0070,0036,1254,6523,3657,5210,7530);
		//List<Integer> u=atmpinStream.filter((e)->e>1000).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//u.forEach((q)->System.out.println(q));

	}

}
