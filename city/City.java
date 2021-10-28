package com.xworkz.cityapp;
import com.xworkz.cityapp.dto.CompaniesDTO;

public class City {
	
        private CompaniesDTO[] companies;
		private int index;
		
		public City(int size) {
			companies=new CompaniesDTO[size];
		}
		
		public boolean createCompanies(CompaniesDTO hotel) {
			boolean CompaniesAdded= false;
			System.out.println("inside create companies method");
			
			if (companies!=null) {
				this.companies[index++]=hotel;
				CompaniesAdded=true;
				
			}else {
			System.out.println("no hotel is available");
			return CompaniesAdded=false;
			
		}
		return CompaniesAdded;
	}

	public boolean updateCompaniesNameByPlace(String companiesPlace, String companiesName) {
		System.out.println("inside the update company name by place");
		boolean update=false;
		
		if(companiesPlace!=null&& companiesName!=null) {
			for(int i=0;i<companies.length;i++) {
				if(companies[i].getCompaniesPlace().equals(companiesPlace)) {
					System.out.println("name is found , now update the place"+"  "+companiesPlace+"  "+companiesName);
					companies[i].setCompaniesPlace(companiesPlace);
					update=true;
				}
				else
					System.out.println("name is found, now update the place");
				update=false;
				
				}
			}
		
		return update;
		}

	public CompaniesDTO getCompaniesByName(String companiesName) {
		CompaniesDTO dto = null;
		if(companiesName!=null) {
			for(int i=0;i<companies.length;i++) {
				if(companies[i].getCompaniesName().equals(companiesName)) {
					System.out.println("companies name is :"+companiesName);
					dto=companies[i];
					
				}
				else 
					System.out.println("company name no found");
			}
		}
		return dto;
	}
		
		public CompaniesDTO getCompaniesByPlace(String companiesPlace) {
			CompaniesDTO dto = null;
			if(companiesPlace!=null) {
				for(int i=0;i<companies.length;i++) {
					if(companies[i].getCompaniesPlace().equals(companiesPlace)) {
						System.out.println("hotel place is :"+companiesPlace);
						dto=companies[i];
						
					}
					else
						System.out.println("Company place not found");
				}
			}
			return dto;
		}
		
		public CompaniesDTO getCompaniesBySalary(int companiesSalary) {
			CompaniesDTO dto = null;
			if(companiesSalary!=0) {
				for(int i=0;i<companies.length;i++) {
					if(companies[i].getCompaniesSalary()==(companiesSalary)) {
						System.out.println("Salary given by this company :"+companiesSalary);
						dto=companies[i];
						
					}
					else
						System.out.println("Salary not given");
				}
			}
			return dto;
		}

	public void deleteCompaniesBySalary(int companiesSalary) {
		System.out.println("inside delete companies by salary()");
		
		if(companiesSalary>0) {
			for(int i=0;i<companies.length;i++) {
				
				if(companies[i].getCompaniesSalary()==(companiesSalary)) {
					System.out.println("company  deleted by place :"+companiesSalary);
					companies[i].setCompaniesSalary(companiesSalary);
					
				}
				else {
					System.out.println("company is not deleted");
				}
			}
		}
	}

	}



