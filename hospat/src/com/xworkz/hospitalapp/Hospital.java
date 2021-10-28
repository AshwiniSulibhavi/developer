package com.xworkz.hospitalapp;
import com.xworkz.dto.*;

public class Hospital {
	
	
	
	public PatientDTO[] patients;
	private int index;
	
	public Hospital(int size)
	{
		patients =new PatientDTO[size];
	}
	
	public boolean createPatient(PatientDTO patients)
	{
		boolean patientAdded = false;
		System.out.println("Inside create patient method ");
		if(patients != null)
			{
				this.patients[index++] = patients;
				patientAdded = true;
			}
			else
			{
				System.out.println("No Patient added");
				return patientAdded = false;
			}
		return patientAdded;
	}
	
	
    public void getAllPatients()
	{
		for(int i=0; i<patients.length; i++)
		{
			System.out.println(patients[i]);
		}
	}
    
    
    public PatientDTO getPatientByName(String patientName)
	{
		boolean f=false;
		PatientDTO patientDTO = null; 
		System.out.println("Inside Get patient by name method");
		if(patientName != null)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getPatientName().equals(patientName))
				{
					System.out.println("Patient found by Name : "+patientName);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
	
		public PatientDTO getPatientByAddress(String address)
	{
		boolean f=false;
		PatientDTO patientDTO = null;
		System.out.println("Inside Get patient by address method");
		if(address != null)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i]
().equals(address))
				{
					System.out.println("Patient found by Name : "+address);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	public PatientDTO getPatientById(int patientId)
	{
		boolean f=false;
		PatientDTO patientDTO= null;
		System.out.println("Inside Get patient by id method");
		if(patientId != 0)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getPatientId()==(patientId))
				{
					System.out.println("Patient found by ID : "+patientId);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
	public PatientDTO getPatientByAge(int age)
	{
		boolean f=false;
		PatientDTO patientDTO=null;
		System.out.println("Inside get patient by age method");
		if(age != 0)
		{
			for(int i =0;i<patients.length;i++)
			{
				if(patients[i].getAge()==(age))
				{
					System.out.println("Patient found by age : "+age);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
					
				}
			}
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
	
	public PatientDTO getPatientByCountryName(String countryName)
	{
		boolean f=false;
		PatientDTO patientDTO = null; 
		System.out.println("Inside Get patient by  address name method");
		if(countryName != null)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getAddress().getCountry().getCountryName().equals(countryName))
				{
					System.out.println("Patient found by address Name : "+countryName);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
			
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
	public PatientDTO getPatientByAreaName(String areaName)
	{
		boolean f=false;
		PatientDTO patientDTO = null; 
		System.out.println("Inside Get patient by  area  name method");
		if(areaName != null)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getAddress().getCountry().getState().getDistrict().getArea().equals(areaName))
				{
					System.out.println("Patient found by address Name : "+areaName);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
			
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	public PatientDTO getPatientByStreetName(String streetName)
	{
		boolean f=false;
		PatientDTO patientDTO = null; 
		System.out.println("Inside Get patient by  street name method");
		if(streetName != null)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getAddress().getCountry().getState().getDistrict().getArea().getStreet().getStreetName().equals(streetName))
				{
					System.out.println("Patient found by address Name : "+streetName);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else {
					f=false;
				}
			}	
			
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
	
	public PatientDTO getPatientByStreetd(int streetId)
	{
		boolean f=false;
		PatientDTO patientDTO = null; 
		System.out.println("Inside Get patient by street id  name method");
		if(streetId == 0)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getAddress().getCountry().getState().getDistrict().getArea().getStreet().getStreetId()==0)
				{
					System.out.println("Patient found bystreet id : "+streetId);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
			
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}


}
