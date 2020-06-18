package com.compChallenge;

public class TV {
	private String brand;
	private String size;
	public TV(String brand, String size) {
		this.brand = brand;
		this.size = size;
	}
	public void pressPowerOn() {
		System.out.println("Power button pressed...");
		switchOn();
	}
	
	private void switchOn() {
		System.out.println("Your "+ brand+" "+size+ " Tv is switching on");
	}
	
	public String getBrand() {
		return brand;
	}
	public String getSize() {
		return size;
	}

}
