package com.xworkz.program.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNRStreamEstablisher {
	public static void main(String[] args) {
		
		
		Stream<Integer> pnrStream=Stream.of(45621,456238,552157,5463219,254963,558525,2148785,33244526,45353524,26544126,3256412,256584125,225641,25870258,211554,12458521,125689741,125689562,245682,65895741,2365841,2369581,235682,022165413652,56412541,175252452,5487414);
		
		List<Integer> s= pnrStream.sorted().collect(Collectors.toList());
		s.forEach((t)->System.out.println(t));
		
		
		
//Stream<Integer> pnrStream=Stream.of(45621,456238,552157,5463219,254963,558525,2148785,33244526,45353524,26544126,3256412,256584125,225641,25870258,211554,12458521,125689741,125689562,245682,65895741,2365841,2369581,235682,022165413652,56412541,175252452,5487414);
		
		//List<Integer> s= pnrStream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//s.forEach((t)->System.out.println(t));

	}
	
	


}
