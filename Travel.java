package com.xworkz.cloning.application;

public class Travel implements Cloneable {

	
	
	
	

	private String travelAgencyName;
	private int seatNumber;
	private String busNumber;
	private int cost;
	private int travelAgencyNumber;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	public String getTravelAgencyName() {
		return travelAgencyName;
	}
	public void setTravelAgencyName(String travelAgencyName) {
		this.travelAgencyName = travelAgencyName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTravelAgencyNumber() {
		return travelAgencyNumber;
	}
	public void setTravelAgencyNumber(int travelAgencyNumber) {
		this.travelAgencyNumber = travelAgencyNumber;
	}
	
	

}
