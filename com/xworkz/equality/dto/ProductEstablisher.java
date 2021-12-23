package com.xworkz.equality.dto;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class ProductEstablisher {

	
	
public static void main(String[] args) {
		
		ProductDTO dto = new ProductDTO(1, "Dell", "Computers", 45999.00, 2);
		ProductDTO dto1 = new ProductDTO(2, "Lenovo", "Laptop", 30000.00, 7);
		ProductDTO dto2 = new ProductDTO(3, "Boat", "Ear buds", 2999.00, 12);
		ProductDTO dto3 = new ProductDTO(4, "Lakme", "Kajol", 500.00, 8);
		ProductDTO dto4 = new ProductDTO(5, "Philips", "Hair Straightner", 4000.00, 6);
		ProductDTO dto5 = new ProductDTO(6, "Redmi", "Mobile", 20000.00, 1);
		ProductDTO dto6 = new ProductDTO(6, "Redmi", "Mobile", 20000.00, 1);
		
		Set<ProductDTO> d = new LinkedHashSet<ProductDTO>();
		d.add(dto1);
		d.add(dto2);
		d.add(dto3);
		d.add(dto4);
		d.add(dto5);
		d.add(dto6);
		d.add(dto);
		
		boolean b = dto5.equals(dto6);
		System.out.println(b);
		
		Optional<ProductDTO> optional = d.stream().filter((u)->u.getPrice()>10000.0).findFirst();
		System.out.println(d.size());
		System.out.println(optional);
	}
}

