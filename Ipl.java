package com.xworkz.dao.ipl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ipl {

	private Collection<String> teamNameCollection1 =new ArrayList<String>();
		
		public boolean save1(String teamName) {
			Iterator itr=teamNameCollection1.iterator();
			
			return  teamNameCollection1.add(teamName);
			
		}
		
		public boolean find1(String name) {
			
			Iterator<String> itr=teamNameCollection1.iterator();
			while (itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.equals(name)) {
					return true;
				}
			return teamNameCollection1.contains(name);
			
		}
			return false;
		}
			
		
		public boolean findByCaseInsensitive1(String name) {
			Iterator<String> itr=teamNameCollection1.iterator();
			while (itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.equalsIgnoreCase(name)) {
					return true;
				}
				
			}
			return false;
		}
		
		
		
		public boolean findByCaseInsensitiveAndTrimmed1(String name) {
			Iterator<String> itr=teamNameCollection1.iterator();
			while (itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.trim() != null) {
					return true;
				}
			}
			return false;
			
		}
		


	private Collection<String> teamNameCollection =new ArrayList<String>();
		
		public boolean save(String teamName) {
			Iterator itr=teamNameCollection1.iterator();
			
			return  teamNameCollection1.add(teamName);
			
		}
		
		public boolean find(String name) {
			
			Iterator<String> itr=teamNameCollection1.iterator();
			while (itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.equals(name)) {
					return true;
				}
			return teamNameCollection1.contains(name);
			
		}
			return false;
		}
			
		
		public boolean findByCaseInsensitive(String name) {
			Iterator<String> itr=teamNameCollection1.iterator();
			while (itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.equalsIgnoreCase(name)) {
					return true;
				}
				
			}
			return false;
		}
		
		
		
		public boolean findByCaseInsensitiveAndTrimmed(String name) {
			Iterator<String> itr=teamNameCollection1.iterator();
			while (itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.trim() != null) {
					return true;
				}
			}
			return false;
			
		}
		
	}
