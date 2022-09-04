package com.automobile.twowheeler;

public class Honda extends com.automobile.Vehicle{

	
	public String getModelName() {
		
		return "Creta";
	}

	
	public String getRegisterNumber() {
		
		return "HO1234";
	}

	
	public String getOwnerName() {
		
		return "KamaleshHonda";
	}

	public int getSpeed() {
		return 150;
	}
	
	public void cdplayer() {
		System.out.println("CD player in Honda");
	}
}
