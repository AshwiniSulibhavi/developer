package com.xworkz.dao.pg;

public class PGEstablisher {

	
	
	
	public static void main(String[] args) {
			String pgName="Aashirwad  PG";
			pgName=pgName.replace("", "");
			System.out.println(pgName);
			
			PG dao = new PG();
			dao.save("Aashirwad pg");
			dao.save("Khushi PG");
			dao.save("Comfort PG");
			dao.save("Golden  PG");
			dao.save(" Adler Stays PG");
			
			boolean found = dao.find("Ashirwad PG");
			System.out.println(found);
			
			found=dao.findByCaseInSensitive("Khushi PG");
			System.out.println(found);
			
			found=dao.findByCaseInSensitiveAndTrimmed("Comfort PG");
			System.out.println(found);
			
		}

}
