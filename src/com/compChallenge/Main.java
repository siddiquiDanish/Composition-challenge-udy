package com.compChallenge;

public class Main {

	public static void main(String[] args) {
		Wardrobe theWardrobe = new Wardrobe("Godrej","Aspire","Wooden",false);
		Bed theBed = new Bed ("Double_Bed", "IKEA", new Dimension("6ft.","4ft."));
		TV theTV = new TV("Samsung","52 inch");
		
		Room theRoom = new Room(theWardrobe,theBed,theTV);
		
		theRoom.openDoor();
		theRoom.getTheTV().pressPowerOn();
		theRoom.getTheBed().makeBed();
	}

}
