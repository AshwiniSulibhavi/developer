package com.xworkz.dto;

public class AreaDTO {
	
	
private int areaId;
private String areaName;
private StreetDTO street;


public int getAreaId() {

	return areaId;
}
public void setAreaId(int areaId) {
	this.areaId = areaId;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
@Override
public String toString() {
	return "AreaDTO-{areaId=" + areaId + ", areaName=" + areaName + "}";
}



}
