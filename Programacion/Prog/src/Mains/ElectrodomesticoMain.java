package Mains;

import Clases.Electrodomestico;

public class ElectrodomesticoMain {

	public static void main(String[] args) {
		Electrodomestico bombilla = new Electrodomestico (false, 150);
		Electrodomestico plancha = new Electrodomestico (false, 2000);
		
		
		System.out.println(bombilla.toString());
		bombilla.encender();
		System.out.println();
		System.out.println(bombilla.toString());
		
		plancha.encender();
		System.out.println(plancha.toString());
		
		System.out.println(plancha.getPotencia());
	
	}

}
