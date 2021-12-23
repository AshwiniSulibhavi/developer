package com.xworkz.stream2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeadphoneEstablisher {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		HeadphoneDTO dto= new HeadphoneDTO(10,"boat","wired",145263,999);
		HeadphoneDTO dto1= new HeadphoneDTO(11,"JBL","wireless",852314,1799);
		HeadphoneDTO dto2= new HeadphoneDTO(12,"Sony","wireless",754123,3999);
		HeadphoneDTO dto3= new HeadphoneDTO(14,"Bose","wired",236554,2599);
		HeadphoneDTO dto4= new HeadphoneDTO(13,"Mi","wireless",524163,1999);
		
		Stream<HeadphoneDTO> headphone=Stream.of(dto,dto1,dto2,dto3,dto4);
		
		headphone
		.filter((type)->type.getType().equals("Wired"))
		.sorted((i,d)->i.getId().compareTo(d.getId()))
	    .collect(Collectors.toList()).forEach((r)->System.out.println(r));
		
		System.out.println(System.lineSeparator());
		
		
		Stream<HeadphoneDTO> headphone1=Stream.of(dto,dto1,dto2,dto3,dto4);
		headphone1.filter((y)->y.getModel().equals("wireless")).sorted((a,m)->a.getBrand().compareTo(m.getBrand())).map((l)->l.getModel()).collect(Collectors.toList()).forEach((t)->System.out.println(t));
		
		
	}

}
