package com.xworkz.dto;

public class StateDTO {
	
	private int stateId;
	private String stateName;
	
	private DistrictDTO district;
	
	
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "StateDTO-{stateId=" +this.stateId + ", stateName=" +this.stateName + "}";
	}
	
	

}
