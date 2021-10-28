package com.xworkz.hospitalapp;
import com.xworkz.dto.*;

import java.util.*;
public class HospitalTester {
	
	

		public static void main(String args[]){
			
		System.out.println("Enter the no of patient size");    
		// size providing at the runtime
		Scanner sc = new Scanner(System.in);	
	    int size = sc.nextInt();
		Hospital hospital = new Hospital(size);

	       for(int i=0; i<size; i++)
	       {
	    		PatientDTO dto = new PatientDTO();
		
			System.out.println("Enter the patient Detals ");
			System.out.println("Enter the Patient Id");
			int PatientId = sc.nextInt();
			dto.setPatientId(PatientId);
			
			System.out.println("Enter the Patient Name");
			String setPatientName =sc.next();
			dto.setPatientName(setPatientName);
			
			System.out.println("Enter the Patient Contact Number");
			long PatientContactNumber = sc.nextLong();
			dto.setContactNo(PatientContactNumber);
			

			   
			   System.out.println("Enter the Patient Blood Goup");
				String PatientBloodGroup = sc.next();
				dto.setBloodGroup(PatientBloodGroup);
				
				System.out.println("Enter the Patient Age");
				int PatientAge =sc.nextInt();
				dto.setAge(PatientAge);
				
				System.out.println("Enter the Patient Gender");
				String PatientGender = sc.next();
				dto.setGender(PatientGender);
			   
				System.out.println("Enter the Patient Address");
				
				AddressDTO address = new AddressDTO();
				System.out.println("Enter the Patient Address id");
				   address.setAddressId(sc.nextInt());
				   
			
				CountryDTO countryDTO = new CountryDTO();
				System.out.println("Enter the country name ");
				countryDTO.setCountryName(sc.next());
				System.out.println("Enter the country id ");
				countryDTO.setCountryId(sc.nextInt());
			
			   
				StateDTO sta1 = new StateDTO();
				System.out.println("Enter the  state name ");
				sta1.setStateName(sc.next());
				System.out.println("Enter the stateid ");
				sta1.setStateName(sc.next());
				
				DistrictDTO district = new DistrictDTO();
				System.out.println("Enter the District name ");
				district.setDistrictName(sc.next());
				district.setDistrictId(sc.nextInt());
				
				AreaDTO  area = new AreaDTO();
				System.out.println("Enter the area name  ");
			    area.setAreaName(sc.next());
			    System.out.println("Enter the area  id");
			    area.setAreaId(sc.nextInt());
			    
			    StreetDTO street = new StreetDTO();
				System.out.println("Enter the Street name  ");
			    street.setStreetName(sc.next());
			    System.out.println("Enter the strret  id");
			    street.setStreetId(sc.nextInt());
			    System.out.println("Enter the street  id");
			    street.setStreetNo(sc.nextInt());
			    
			    dto.setAddress(address);
				 address.setCountry(countryDTO);
				 countryDTO.setState(sta1);
				 sta1.setDistrict(district);
				 district.setArea(area);
				 area.setStreet(street);
				 
				
			   hospital.createPatient(dto);
	       }
	       
	System.out.println("Enter country name");
	String coun=sc.next();
	System.out.println(hospital.getPatientByCountryName(coun));
	       
	System.out.println("Enter street name");
	String  stre=sc.next();
	System.out.println(hospital.getPatientByCountryName(stre));

	System.out.println("Enter street id");
	String si=sc.next();
	System.out.println(hospital.getPatientByCountryName(si));
			hospital.getAllPatients();
			
			System.out.println("Enter Area name");
			String are=sc.next();
			System.out.println(hospital.getPatientByCountryName(are));
	}
	}


	
	
	
	
	

