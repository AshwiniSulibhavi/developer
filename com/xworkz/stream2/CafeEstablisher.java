package com.xworkz.stream2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CafeEstablisher {
	
public static  void main(String[] args) {
		
		CafeDTOEstablisher dto=new CafeDTOEstablisher("siri", "veg", "Chikkamagaluru", 4.5f, 123);
		CafeDTOEstablisher dto1=new CafeDTOEstablisher("Chethan cafe cofee day", "veg", "Chikkamagaluru", 5.0f, 1234);
		CafeDTOEstablisher dto2=new CafeDTOEstablisher("Ramanas", "non-veg", "bangalore", 1.0f, 12345);
		CafeDTOEstablisher dto3=new CafeDTOEstablisher("Nikunj stall", "veg and non veg", "gujarat", 4.3f, 123456);
		
		
		Stream<CafeDTOEstablisher> se= Stream.of(dto, dto1,dto2,dto3);
		
		se.filter((e)->e.getRatings()>3).sorted((e,e1)->e1.getName().compareTo(e.getName())).collect(Collectors.toList()).forEach((a)->System.out.println(a));
		//se.collect(Collectors.toList()).forEach((e)->System.out.println(e));
		//se.forEach((e)->System.out.println(e));
		
	}

}


