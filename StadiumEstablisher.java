package com.xworkz.cloning.application;

public class StadiumEstablisher {
	
	
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Stadium st = new Stadium();
		st.setName("Nadaprabhu Kempegowda stadium");
		st.setLocation(" Bengaluru");
		st.setContNo(98765432L);
		st.setArea("Rajajinagar");
		st.setNoOfChairs(900);
		
		Stadium st1 = (Stadium) st.clone();
		
		System.out.println(st.getName());
        System.out.println(st.getLocation());
        System.out.println(st.getContNo());
        System.out.println(st.getArea());
        System.out.println(st.getNoOfChairs());
    

}


}
