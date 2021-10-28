package com.xworkz.dto;

public class DistrictDTO {
	
	private  int  districtId;
	private  String districtName;
	private AreaDTO area;
	
	
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	@Override
	public String toString() {
		return "DistrictDTO-{districtId=" +this. districtId + ", districtName=" +this. districtName + "}";
	}
	
	
	

}
