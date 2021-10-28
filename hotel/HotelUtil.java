package com.xworkz.hotelapp;
import java.util.*;
import com.xworkz.hotelapp.dto.HotelDTO;

public class HotelUtil {
	
	public static void main(String ar[]) {
		System.out.println("look into hotel list");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
				int size= sc.nextInt();
		Hotel hotel=new Hotel(size);
		
		for(int i=0;i<size;i++) {
			HotelDTO dto= new HotelDTO();
			
			System.out.println("Enter the Hotel details");
			System.out.println("enter the Hotel name");
			
			String hotelName=sc.next();
			dto.setHotelName(hotelName);
			
			System.out.println("enter the Hotel cost");
			int  hotelCost=sc.nextInt();
			dto.setHotelCost(hotelCost);
			
			System.out.println("enter the place");
			String hotelPlace=sc.next();
			dto.setHotelPlace(hotelPlace);
			
			System.out.println("enter the Hygine ratings");
			int hotelHygine=sc.nextInt();
			dto.setHotelHygine(hotelHygine);
			
			
			boolean isAdded= hotel.createHotel(dto);
			System.out.println(isAdded);
			
			
		}
		hotel.getHotelByName("Le Grand");

		hotel.getHotelByPlace("Bijapur");
	
		hotel.updateHotelHygineByCost(2000, 9);
		hotel.deleteHotelByCost(4000);
		
	}
	

}
