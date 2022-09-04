package com.automobile.FourWheeler;

public class Ford extends com.automobile.Vehicle{

	
	public String getModelName() {
		
		return "Ford";
	}

	
	public String getRegisterNumber() {
		
		return "FO1234";
	}


	public String getOwnerName() {
		
		return "KamaleshFord";
	}
	
	public int speed() {
		return 160;
	}
	
	public void tempControl() {
		System.out.println("Provides control to the AC");
	}

}
