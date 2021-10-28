package com.xworkz.shoppapp;

import java.util.*;
import com.xworkz.shopapp.dto.ElectronicGadgetsDTO;

public class ShopUtil {
	
	
	public static void main(String ar[]){
		System.out.println("look into Gadget list ");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
	Shop shop = new Shop(size);
	

	
	for(int i=0;i<size;i++){
		ElectronicGadgetsDTO dto = new ElectronicGadgetsDTO();
		
	    System.out.println("Enter the Gadget Details");
		
		    System.out.println("Enter the Gadget Name");
		 
			String gadgetsName = sc.next();
			dto.setGadgetsName(gadgetsName);
		
		    
			System.out.println("Enter the Gadget price");
				int gadgetsPrice = sc.nextInt();
				dto.setGadgetsPrice(gadgetsPrice);

				System.out.println("Enter the Gadget Quality");
				String gadgetsQuality = sc.next();
				dto.setGadgetsQuality(gadgetsQuality);
				
				System.out.println("Enter the Gadget Brand");
				String gadgetsBrand = sc.next();
				dto.setGadgetsBrand(gadgetsBrand);
				
				System.out.println("Enter the Gadget Warrenty");
				String gadgetsWarrenty = sc.next();
				dto.setGadgetsWarrenty(gadgetsWarrenty);
				
				
				
				boolean isadded = shop.createGadget(dto);
				System.out.println(isadded);
				
				}
				
				shop.getGadgetsByName("Earpods");
				
                shop.getGadgetsByPrice(3500);
				shop.getGadgetsByWarrenty("2 years");
				shop.getGadgetsByBrand("OnePlus");
			    shop.deleteGadgetByQuality("bad");
			    
			    shop.updateGadgetsQualityByPrice(3500,"best");
      
				
				
			    
				
				
				
	}			
					
}
