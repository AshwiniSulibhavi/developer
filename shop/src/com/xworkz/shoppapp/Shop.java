package com.xworkz.shoppapp;
import com.xworkz.shopapp.dto.ElectronicGadgetsDTO;

public class Shop {
	
	private ElectronicGadgetsDTO[] gadgets;
	private int index;
	
	public Shop(int size) {
		 gadgets= new ElectronicGadgetsDTO[size];
	}
	
	
	public boolean createGadget(ElectronicGadgetsDTO gadgets) {
		boolean ElectronicGadgetsadded =false;
		System.out.println("inside createGadgets method");
		
		if(gadgets!= null) {
			this.gadgets[index++]=gadgets;
			ElectronicGadgetsadded=true;
	
		}
		
		else {
			System.out.println("No gadget is available");
			return ElectronicGadgetsadded =false;
		}
		return ElectronicGadgetsadded;
	}
	
	
	public boolean updateGadgetsQualityByPrice(int price, String quality){
		System.out.println("inside the updateGadgetQualityByPrice");
		boolean update=false;
		if(price>0 && quality!=null){
			for(int i=0;i<gadgets.length;i++){
				if(gadgets[i].getGadgetsPrice()==price){
					System.out.println("Price is found now update the Quality" +"    " +price +"  "+quality);
					gadgets[i].setGadgetsQuality(quality);
					update=true;
				}
				else
					System.out.println("Price is found now update the quality");
					update=false;
			}
		}
		return update;
	}
	
	

	public ElectronicGadgetsDTO getGadgetsByPrice(int gadgetsPrice){
	ElectronicGadgetsDTO dto = null;
		if(gadgetsPrice!=0){
			for(int i=0;i<gadgets.length;i++){
				if(gadgets[i].getGadgetsPrice()==(gadgetsPrice)){
					System.out.println("gadget price is:"+gadgetsPrice);
			   dto=gadgets[i];
				}
				else
				System.out.println("Gadgets price not found");
			}
		}
	return dto;
	}
	

	public ElectronicGadgetsDTO getGadgetsByName(String gadgetsName){
		ElectronicGadgetsDTO dto = null;
			if(gadgetsName!=null){
				for(int i=0;i<gadgets.length;i++){
					if(gadgets[i].getGadgetsName().equals(gadgetsName)){
						System.out.println("gadget price is:"+gadgetsName);
				   dto=gadgets[i];
					}
					else
					System.out.println("Gadgets Name not found");
				}
			}
		return dto;
		}
		
	
	public ElectronicGadgetsDTO getGadgetsByBrand(String gadgetsBrand){
		ElectronicGadgetsDTO dto = null;
			if(gadgetsBrand!=null){
				for(int i=0;i<gadgets.length;i++){
					if(gadgets[i].getGadgetsBrand().equals(gadgetsBrand)){
						System.out.println("gadget Brand is:"+gadgetsBrand);
				   dto=gadgets[i];
					}
					else
					System.out.println("Gadgets Brand not found");
				}
			}
		return dto;
		}
	
			
	
	
	public ElectronicGadgetsDTO getGadgetsByWarrenty(String gadgetsWarrenty){
		ElectronicGadgetsDTO dto = null;
			if(gadgetsWarrenty!=null){
				for(int i=0;i<gadgets.length;i++){
					if(gadgets[i].getGadgetsWarrenty().equals(gadgetsWarrenty)){
						System.out.println("gadget warrenty is:"+gadgetsWarrenty);
				   dto=gadgets[i];
					}
					else
					System.out.println("Gadgets warrenty is not available");
				}
			}
		return dto;
		}
		
	public void deleteGadgetByQuality(String gadgetsQuality) {
		System.out.println("inside delete Gadget By Quality()");
		
		if(gadgetsQuality!=null) {
			for(int i=0;i<gadgets.length;i++) {
				
				if(gadgets[i].getGadgetsQuality().equals(gadgetsQuality)) {
					System.out.println("Gadget deleted by Quality:"+gadgetsQuality);
					gadgets[i].setGadgetsQuality(gadgetsQuality);
					
				}
				
				else {
					System.out.println("gadget is not deleted");
				}
			}
		}
	}
	
	
	
	
	
	
}
