package com.xworkz.dao.email;

public class EmailEstablisher {

	public static void main(String[] args) {
		
		
		Email   dao = new Email();
		dao.save("sulibhaviashwini241@gmail.com");
		dao.save("sulibhaviashwini666@gmail.in");
		
		EmailSearch email = new EmailSearchByCom();
		boolean found = dao.find(email,"sulibhaviashwini241@gmail.com");
		System.out.println(found);
		
		EmailSearch email1=new EmailSearchByIn();
		boolean found1=dao.find(email1,"sulibhaviashwini666@gmail.in");
		System.out.println(found1);
		
		EmailSearch email2= new EmailSearchByMail();
		boolean found2=dao.find(email2, "sulibhaviashwini241@gmail.In");
		System.out.println(found2);
		
		}

}
