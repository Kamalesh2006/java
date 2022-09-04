package com.automobile.twowheeler;

public class Hero extends com.automobile.Vehicle{

	
	public String getModelName() {
		
		return "HeroSplender";
	}

	
	public String getRegisterNumber() {
		
		return "HE1234";
	}

	
	public String getOwnerName() {
		return "Kamalesh";
	}

	public int speed() {
		return 120;
	}

	public void radio() {
		System.out.println("Radio Hero");
	}
}
