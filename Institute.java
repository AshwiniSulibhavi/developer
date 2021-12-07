package com.xworkz.cloning.application;

public class Institute implements Cloneable{

	


	private String name;
	private String location;
	private long contNo;
	private int NoOfBranches;
	private int NoOfStudents;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	 
		return super.clone();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContNo() {
		return contNo;
	}
	public void setContNo(long contNo) {
		this.contNo = contNo;
	}
	public int getNoOfBranches() {
		return NoOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		NoOfBranches = noOfBranches;
	}
	public int getNoOfStudents() {
		return NoOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		NoOfStudents = noOfStudents;
	}
	



}
