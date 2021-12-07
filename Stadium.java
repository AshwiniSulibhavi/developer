package com.xworkz.cloning.application;

public class Stadium implements Cloneable {

	

	private String name;
	private String location;
	private long contNo;
	private String area;
	private int NoOfChairs;
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getNoOfChairs() {
		return NoOfChairs;
	}
	public void setNoOfChairs(int noOfChairs) {
		NoOfChairs = noOfChairs;
	}
	


}
