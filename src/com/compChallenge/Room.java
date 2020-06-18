package com.compChallenge;

public class Room {
	private Wardrobe theWardrobe;
	private Bed theBed;
	private TV theTV;
	public Room(Wardrobe theWardrobe, Bed theBed, TV theTV) {
		super();
		this.theWardrobe = theWardrobe;
		this.theBed = theBed;
		this.theTV = theTV;
	}
	
	public void openDoor() {
		System.out.println("Doors opened");
		lightsOn();
	}
	private void  lightsOn() {
		System.out.println("Now tubelight is on");
	}

	public Wardrobe getTheWardrobe() {
		return theWardrobe;
	}

	public Bed getTheBed() {
		return theBed;
	}

	public TV getTheTV() {
		return theTV;
	}

}
