package com.xworkz.stream2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class HeadphoneDTO implements  Serializable  {
	
	private Integer id;
	private String brand;
	private String type;
	private Integer model;
	private Integer pricel;
	
	public HeadphoneDTO(Integer id, String brand, String type, Integer model, Integer pricel) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.model = model;
		this.pricel = pricel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public Integer getPricel() {
		return pricel;
	}

	public void setPricel(Integer pricel) {
		this.pricel = pricel;
	}

	@Override
	public String toString() {
		return "HeadphoneDTO [id=" + id + ", brand=" + brand + ", type=" + type + ", model=" + model + ", pricel="
				+ pricel + "]";
	}
	
	

}
