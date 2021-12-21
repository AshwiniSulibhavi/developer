package com.xworkz.program.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNoStreamEstablisher {
	
	
	public static void main(String[] args) {
		

	
	Stream<Integer> rollnoStream=Stream.of(52,10,1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	
	List<Integer> list=rollnoStream.filter((o)->o>0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	list.forEach((n)->System.out.println(n));
	
	
	
	//List<Integer> list1=rollnoStream.sorted().collect(Collectors.toList());
	//list1.forEach((p)->System.out.println(p));//

}
	
	
	
}