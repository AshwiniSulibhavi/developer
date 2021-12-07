package com.xworkz.cloning.application;

public class Pens implements Cloneable {
	
	
	

	private String name;
	private int cost;
	private String type;
	private String colour;
	private int noOfPens;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
    public String getName() {
		return name;
	}
   public void setName(String name) {
		this.name = name;
	}
   public int getCost() {
		return cost;
	}
  public void setCost(int cost) {
		this.cost = cost;
	}
  public String getType() {
		return type;
	}

    public void setType(String type) {
		this.type = type;
	}
   public String getColour() {
		return colour;
	}
   public void setColour(String colour) {
		this.colour = colour;
	}

    public int getNoOfPens() {
		return noOfPens;
	}

   public void setNoOfPens(int noOfPens) {
		this.noOfPens = noOfPens;
	}



}
