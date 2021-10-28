package com.xworkz.shopapp.dto;

public class ElectronicGadgetsDTO {
	
	private int gadgetsPrice;
	private String gadgetsName;
	private String gadgetsWarrenty;
	private String gadgetsQuality;
	private String gadgetsBrand;
	
	
	public ElectronicGadgetsDTO(){
		System.out.println(this.getClass().getSimpleName()+"object is created");
		}


	public int getGadgetsPrice() {
		return gadgetsPrice;
	}


	public void setGadgetsPrice(int gadgetsPrice) {
		this.gadgetsPrice = gadgetsPrice;
	}


	public String getGadgetsName() {
		return gadgetsName;
	}


	public void setGadgetsName(String gadgetsName) {
		this.gadgetsName = gadgetsName;
	}


	public String getGadgetsWarrenty() {
		return gadgetsWarrenty;
	}


	public void setGadgetsWarrenty(String gadgetsWarrenty) {
		this.gadgetsWarrenty = gadgetsWarrenty;
	}


	public String getGadgetsQuality() {
		return gadgetsQuality;
	}


	public void setGadgetsQuality(String gadgetsQuality) {
		this.gadgetsQuality = gadgetsQuality;
	}


	public String getGadgetsBrand() {
		return gadgetsBrand;
	}


	public void setGadgetsBrand(String gadgetsBrand) {
		this.gadgetsBrand = gadgetsBrand;
	}


	@Override
	public String toString() {
		return "ElectronicGadgetsDTO [gadgetsPrice=" + gadgetsPrice + ", gadgetsName=" + gadgetsName
				+ ", gadgetsWarrenty=" + gadgetsWarrenty + ", gadgetsQuality=" + gadgetsQuality + ", gadgetsBrand="
				+ gadgetsBrand + "]";
	}
		
	
	

}
