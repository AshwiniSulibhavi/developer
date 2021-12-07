package com.xworkz.cloning.application;

public class IstituteEstablisher {
	
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Institute inst = new Institute();
		inst.setName("X-workz");
		inst.setContNo(98765432L);
		inst.setLocation("Banglore");
		inst.setNoOfBranches(2);
		inst.setNoOfStudents(500);
		
		Institute inst1 = (Institute) inst.clone();
		
		System.out.println(inst.getName());
		System.out.println(inst.getContNo());
		System.out.println(inst.getLocation());
		System.out.println(inst.getNoOfBranches());
		System.out.println(inst.getNoOfStudents());
		
	
	}


}
