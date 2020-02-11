package ejerciciosClase;

import java.util.Scanner;

public class EjerciciosAvanzados {

	private static Scanner entrada;
	
	//---Ejercicio 1---
	
	public static String horas() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la primera hora");
		int hora1 = entrada.nextInt();
		System.out.println("Introduzca los primeros minutos");
		int min1 = entrada.nextInt();
		System.out.println("Introduzca los primeros segundos");
		int seg1 = entrada.nextInt();
		System.out.println("Introduzca la segunda hora");
		int hora2 = entrada.nextInt();
		System.out.println("Introduzca los segundos minutos");
		int min2 = entrada.nextInt();
		System.out.println("Introduzca segundos segundos");
		int seg2 = entrada.nextInt();
		
		int acc1=hora1*3600 + min1*60 + seg1;
		int acc2=hora2*3600 + min2*60 + seg2;
		int res;
		res = Math.abs(acc1-acc2);
		
		int horasFinal;
		int minFinal;
		int segFinal;
		
		horasFinal = res/3600;
		minFinal = (res-horasFinal*3600)/60;
		segFinal = (res-horasFinal*3600) +(res-minFinal*60);
		
		
		return horasFinal + " horas " + minFinal  + "minutos " +  segFinal + " segundos";
		
	}
	
	
	
	//---Ejercicio 2---
	
	public static double sueldo(int sueldo) {
		if(sueldo<=1000) {
			return sueldo*0.9;
		}else if(sueldo>1000 && sueldo<=2000) {
			return 900 + ((sueldo-1000)*0.95);
		}else
			return 1850 + ((sueldo-2000)*0.97);
	}
	
	
	
	//---Ejercicio 3---
	
	public static double sueldo2() {
		double res = 0;
		double aux = 0;
		double acc = 0;
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de trabajadores");
		int numeroTrabajadores = entrada.nextInt();
		System.out.println("Hay " + numeroTrabajadores + " trabajadores");
		
		for(int i=1; i<=numeroTrabajadores; i++){
			System.out.println("Introduzca el numero de horas de cada trabajador");
			aux = sueldo(i);
			acc = aux + acc;
			res = acc;
		}
		return res;
	}
	
	
	
	//---Ejercicio 4---
	
	public static String dias( ) {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de minutos");
		int minutos = entrada.nextInt();
		int dias;
		int horas;

		horas = minutos/60;
		dias = horas/24;
		minutos = minutos - dias*24 + horas*60;
		
		return dias + " dias " + horas + " horas " + minutos + " minutos ";
	}
	
	
	
	//---Ejercicio 5---
	
	public static double factura() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el precio del articulo");
		double precioArticulo = entrada.nextDouble();
		
		double res = precioArticulo+precioArticulo*0.15;
		
		if(precioArticulo<50) {
			return res;
		}else
			return res*0.95;
	}
	
	
	
	//---Ejercicio 6---
	
	public static String parteFraccionaria() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		double num = entrada.nextInt();
		
		if(num%10 == 0) {
			return "El numero tiene parte fraccionaria";
		}else 
			return "El numero no tiene parte fraccionaria";
	}
	
	
	
	//---Ejercicio 7---
	
	public static void triangulo() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer lado");
		int l1 = entrada.nextInt();
		System.out.println("Introduzca el segundo lado");
		int l2 = entrada.nextInt();
		System.out.println("Introduzca el tercer lado");
		int l3 = entrada.nextInt();
		
		if((l1 == l2) || (l1 == l3)) {
			System.out.println("El triangulo es isosceles");
		}else if((l1 == l2) && (l1 == l3)){
			System.out.println("El triangulo es equilatero");
		}else if((l1 != l2) && (l1 != l3)){
			System.out.println("El triangulo es escaleno");
		}else if((l1<l2+l3) || (l2<l1+l3) || (l3<l1+l2)){
			System.out.println("No existe triangulo");
		}
	}
	
	
	
	//---Ejercicio 8---
	
	public static String numeros() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int n1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		int n2 = entrada.nextInt();
		System.out.println("Introduzca el tercer numero");
		int n3 = entrada.nextInt();		
		
		if((n1>n2) && (n2>n3)) {
			return n1 + ", " + n2 + ", " + n3  + " y " + n3 + ", " + n2 + ", " + n1 ;
		}else if((n1>n2) && (n2<n3)) {
			return n1 + ", " + n3 + ", " + n2 + " y " + n2 + ", " + n3 + ", " + n1;
		}else if((n1<n2) && (n1>n3)) {
			return n2 + ", " + n1 + ", " + n3 + " y " + n3 + ", " + n1 + ", " + n2;
		}else if((n1<n2) && (n1<n3)){
			return n3 + ", " + n2 + ", " + n1 + " y " + n1 + ", " + n2 + ", " + n3;
		}else if((n1>n2) && (n1>n3)) {
			return n3 + ", " + n1 + ", " + n2 + " y " + n2 + ", " + n1 + ", " + n3;
		}else {
			return n2 + ", " + n3 + ", " + n1 + " y" + n1 + ", " + n3 + ", " + n2;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(horas());
		//System.out.println(sueldo(1500));
		//System.out.println(sueldo2());
		//System.out.println(dias());
		//System.out.println(factura());
		//System.out.println(parteFraccionaria());
		//triangulo();
		//System.out.println(numeros());

	}

}
