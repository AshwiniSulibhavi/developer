package com.xworkz.cloning.application;

public class HospitalEstablisher {
	
	
public static void main(String a[]) throws CloneNotSupportedException {
		
		
		Hospital hospital=new Hospital();
		
		hospital.setHospitalName("Benaka Hospital");
		hospital.setLocation("Rajajinagar");
		hospital.setHospitalContactNo(8095618441L);
		hospital.setNoOfPatients(100);
		hospital.setEnteranceFees(500);
		
		Hospital obj=(Hospital)hospital.clone();
		
		System.out.println(hospital.getHospitalName());
		System.out.println(hospital.getLocation());
		System.out.println(hospital.getHospitalContactNo());
		System.out.println(hospital.getNoOfPatients());
		System.out.println(hospital.getEnteranceFees());
		
	}


}
