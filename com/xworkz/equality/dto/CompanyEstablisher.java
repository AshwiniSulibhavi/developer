package com.xworkz.equality.dto;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class CompanyEstablisher {
	
	
	public static void main(String[] args) {
		
		
		
			
			CompanyDTO dto = new CompanyDTO(1, "Wipro", "Thierry Delaporte", 852148995550.00);
			CompanyDTO dto1 = new CompanyDTO(2, "Capgemini", "Aiman Ezzat", 1445566560000.00);
			CompanyDTO dto2 = new CompanyDTO(3, "Cognizant", "Brian Humphries", 4125589575000.00);
			CompanyDTO dto3 = new CompanyDTO(3, "Cognizant", "Brian Humphries", 1596289575000.00);
			CompanyDTO dto4 = new CompanyDTO(4, "Accenture", "Julie Sweet ", 012503975000.00);
			CompanyDTO dto5 = new CompanyDTO(5, "Eurofins", "Gilles G. Martin", 785203400000.00);
			CompanyDTO dto6 = new CompanyDTO(6, "Oracle", "Shailender Kumar", 728620350000.00);
			
			
			Set<CompanyDTO> dt = new LinkedHashSet<CompanyDTO>(); 
			dt.add(dto1);
			dt.add(dto2);
			dt.add(dto3);
			dt.add(dto4);
			dt.add(dto);
			dt.add(dto5);
			dt.add(dto6);
			
			boolean b = dto2.equals(dto3);
			System.out.println(b);
		
			Optional<CompanyDTO> optional = dt.stream().filter((w)->w.getTurnOver()>140000000000.00).findFirst();
			System.out.println(dt.size());
			System.out.println(optional);
		}
	
	}




