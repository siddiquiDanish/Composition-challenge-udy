package com.compChallenge;

public class Wardrobe {
	private String company;
	private String model;
	private String material;
	private Boolean isFixed;
	public Wardrobe(String company, String model, String material, Boolean isFixed) {
		
		this.company = company;
		this.model = model;
		this.material = material;
		this.isFixed = isFixed;
	}
	
	
	public void openDoors() {
		System.out.println("The doors are opened..");
	}
	public void arrangeClothes() {
		System.out.println("Putting clothes inside...");
	}
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getMaterial() {
		return material;
	}
	public Boolean getIsFixed() {
		return isFixed;
	}

}
