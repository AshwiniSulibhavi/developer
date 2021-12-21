package com.xworkz.program.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PincodeStreamEstablisher {
	public static void main(String[] args) {
		
		
	Stream<Integer> pincodeStream = Stream.of(560021,560063,560034,560007,560092,560024,562106,560045,560003,560064,560047,560026,560086,560002,560070,560064,560073,562149,560053,560085,560009,560025,56001,560004,560086,560103,560056,560068,560040);
	List<Integer> j= pincodeStream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	j.forEach((w)->System.out.println(w));
		
		
	//Stream<Integer> pincodeStream = Stream.of(560021,560063,560034,560007,560092,560024,562106,560045,560003,560064,560047,560026,560086,560002,560070,560064,560073,562149,560053,560085,560009,560025,56001,560004,560086,560103,560056,560068,560040);
	//List<Integer> j= pincodeStream.sorted().collect(Collectors.toList());
	//j.forEach((w)->System.out.println(w));
		
	}

}
