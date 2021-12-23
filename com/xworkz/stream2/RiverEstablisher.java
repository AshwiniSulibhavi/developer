package com.xworkz.stream2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverEstablisher {
	
	public static void main(String[] args) {
		
		RiverDTO dto = new RiverDTO(1,"Ganga","Uttarakand",2525,12);
		RiverDTO dto1 = new RiverDTO(2,"Gadavari","Maharashtra", 1465 ,14);
		RiverDTO dto2= new RiverDTO(3,"Brahmaputra"," Arunachal Pradesh",2900,10);
		RiverDTO dto3= new RiverDTO(4,"Yamuna","northern India",1376,10);
		RiverDTO dto4 = new RiverDTO(5,"kaveri","Karnataka",300,20);
		
		Stream<RiverDTO> river=Stream.of(dto,dto1,dto2,dto3,dto4);
		river
		.filter((riverLength)->riverLength.getLength()>500)
		.sorted((a,m)->m.getNoOfDams().compareTo(a.getNoOfDams()))
		//.sorted((a,m)->a.getNoOfDams().compareTo(m.getNoOfDams()))
		.collect(Collectors.toList()).forEach((p)->System.out.println(p));
		
		
		
		
		
	}

}
