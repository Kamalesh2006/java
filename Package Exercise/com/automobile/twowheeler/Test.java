package com.automobile.twowheeler;

public class Test {

	public static void main(String[] args) {
		Hero he = new Hero();
		Honda ho = new Honda();
		//from Hero class
		System.out.println(he.getModelName());
		System.out.println(he.getOwnerName());
		System.out.println(he.getRegisterNumber());
		System.out.println(he.speed());
		he.radio();
		
		//from Honda class
		
		System.out.println(ho.getModelName());
		System.out.println(ho.getOwnerName());
		System.out.println(ho.getRegisterNumber());
		System.out.println(ho.getSpeed());
		ho.getSpeed();

	}

}
