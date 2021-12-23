package com.xworkz.stream2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooEstablisher {
	
	public static void main(String[] args) {
		
		
		ZooDTO dto= new ZooDTO(1,"Bondla Zoo","Goa",400);
		ZooDTO dto1= new ZooDTO(2,"Alipore Zoological Gardens","Kolkata",500);
		ZooDTO dto2= new ZooDTO(3,"Gorewada Zoo","Maharashtra",300);
		ZooDTO dto3= new ZooDTO(4,"Indra Gandhi Park","Odisha",450);
		ZooDTO dto4= new ZooDTO(5,"Indore Zoo","Madhya Prradesh",200);
		
		@SuppressWarnings("unused")
		Stream<ZooDTO> zoo= Stream.of(dto,dto1,dto2,dto3,dto4);
		
		zoo
		.sorted((a,m)->m.getTicketPrice().compareTo(a.getTicketPrice()))
		.collect(Collectors.toList())
		.forEach((o)->System.out.println(o));
		
		
	}

}
