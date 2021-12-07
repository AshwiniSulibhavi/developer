package com.xworkz.dao.ipl;

public class IplEstablisher {
	
	
	
	
	public static void main(String[] args) {
		String teamName="CSK";
		teamName=teamName.replace("","");
		System.out.println(teamName);
		
		Ipl dao=new Ipl();
		dao.save("RCB");
		dao.save("CSK");
		dao.save("MI");
		
		boolean found=dao.find("csk");
		System.out.println(found);
		
		found=dao.findByCaseInsensitive("rcb");
		System.out.println(found);
		
		found=dao.findByCaseInsensitiveAndTrimmed("MI");
		System.out.println(found);
		
	}
	}

