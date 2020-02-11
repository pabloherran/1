package Mains;

import Clases.Fraccion;

public class FraccionMain {

	public static void main(String[] args) {
		Fraccion f1 = new Fraccion(6,12);
		Fraccion f2 = new Fraccion(7,12);
		Fraccion f3 = new Fraccion();
		
		System.out.println("SUMA");
		System.out.println(f3=f3.suma(f1, f2));
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("RESTA");
		System.out.println(f3=f3.resta(f1, f2));
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("DIVISION");
		System.out.println(f3=f3.division(f1, f2));
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("MULTIPLICACION");
		System.out.println(f3=f3.multiplicacion(f1, f2));
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("INVERSA");
		System.out.println(f3=f3.inversa(f1));
		System.out.println(f3=f3.simplificar(f3));
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("INVERSA");
		System.out.println(f3=f3.inversa(f2));
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("SIMPLIFICAR");
		System.out.println(f3=f3.simplificar(f1));
		System.out.println();
		
		System.out.println("SIMPLIFICAR");
		System.out.println(f3=f3.simplificar(f2));
		System.out.println();
		
	}

}
