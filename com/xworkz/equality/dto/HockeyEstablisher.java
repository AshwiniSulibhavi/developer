package com.xworkz.equality.dto;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class HockeyEstablisher {
	
	
public static void main(String[] args) {
		
		HockeyDTO dto = new HockeyDTO("Bharat Army", 81, 12, "India");
		HockeyDTO dto1 = new HockeyDTO("The Kookaburras", 69, 19, "Australia");
		HockeyDTO dto2 = new HockeyDTO("Green Shirts", 60, 22, "Pakistan");
		HockeyDTO dto3 = new HockeyDTO("Oranje", 59, 21, "Netherland");
		HockeyDTO dto4 = new HockeyDTO("Redsticks", 19, 8, "Spain");
		HockeyDTO dto5 = new HockeyDTO("Kenya Hockey Union", 10, 4, "Kenya");
		
		Set<HockeyDTO> a = new LinkedHashSet<HockeyDTO>();
		a.add(dto);
		a.add(dto1);
		a.add(dto2);
		a.add(dto3);
		a.add(dto4);
		a.add(dto5);
		boolean b = dto5.equals(dto2);
		System.out.println(b);
		Optional<HockeyDTO> optional =  a.stream().filter((o)->o.getWins()>30).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(a.size());
		System.out.println(optional);
	}
}

