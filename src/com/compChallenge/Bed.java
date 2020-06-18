package com.compChallenge;

public class Bed {
	private String theType;
	private String companyName;
	private Dimension dimensions;
	public Bed(String theType, String companyName, Dimension dimensions) {
		this.theType = theType;
		this.companyName = companyName;
		this.dimensions = dimensions;
	}
	public void makeBed() {
		System.out.println("Make your bed!");
		trackingActivity();
	}
	
	private void trackingActivity() {
		System.out.println("Sleeping..zz..zz..");
	}
	
	public String getTheType() {
		return theType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public Dimension getDimensions() {
		return dimensions;
	}
	
	

}
