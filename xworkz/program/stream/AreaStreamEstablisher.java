package com.xworkz.program.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaStreamEstablisher {
	
	public static void main(String[] args) {
		
		
		Stream<String> areaStream=Stream.of("Rajajinagar","Jaynagar","Chickpeth","Mejestic","kalasipalya","Gurguntepalya","Nelamangla","Raj rajeshwari nagar","Matri square","shrirampura","Maleshvaram","vijaynagar","Kormangla","Electronic city","Basavangudi","Indiranagar","Yelahanka","Durgad bail","Keshwapur","Koppikar road","JC nagar","Gokul road","Amargol","Coen road","Hosur","Keshwapur","Sdashiv nagar","P b road");
		
		List<String> h= areaStream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
	h.forEach((i)->System.out.println(i));
	
	//List<String> h= areaStream.sorted().collect(Collectors.toList());
	
	//h.forEach((i)->System.out.println(i));
	
	}

}
