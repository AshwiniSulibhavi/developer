package com.xworkz.program.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountnoStreamEstablisher {
	
	public static void main(String[] args) {
		
		
		Stream<Long> accountnoStream=Stream.of(12323434512611L,2345864565673L,56248512345633L,98736542398745L,54698721556723456L,789524576523434L,32323434545611L,5343454565673L,75623412345633L,58734523498745L,38734556723456L,28734576523434L,12323434545611L,23434000999783L,45600000345633L,98000023498745L,99934556723456L,87654576523434L,45343434545611L,9887454565673L,87653412345633L,12344523498745L,95844556723456L,562438976523434L);
		List<Long> list=accountnoStream.collect(Collectors.toList());
		list.forEach((a)->System.out.println(a));
		
	}

}
