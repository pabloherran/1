package ejerciciosClase;

import java.util.Scanner;

public class EjerciciosPSEint {
	
	private static Scanner entrada;
	
	
	//---Funciones auxiliares---
	
	public static int cuadrado(int x) {
		return (int) Math.pow(x, 2);
	}
	
	
	
	
	//---Ejercicio 22---
	
	public static String fp() {
		entrada = new Scanner(System.in);
		System.out.println("¿Ha cursado bachiller?");
		System.out.println("Introduzca 1 en caso de haber cursado y aprobado bachiller, introduzca 0 en caso contrario");
		int bachiller = entrada.nextInt();
		
		if(bachiller == 1) {
			return "Usted puede acceder a FP";
		}
		System.out.println("¿Ha hecho la pruena de acceso?");
		System.out.println("Introduzca 1 en caso de haber aprobado la prueba de acceso, introduzca 0 en caso contrario");
		int pruebaAcceso= entrada.nextInt();
		if (pruebaAcceso ==1){
			return "Usted puede acceder a FP";
		}else {
			return "Ustad no puede cursar FP";
		}
	}
	
	
	
	//---Ejercicio 23---
	
	public static String esPar() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		int num = entrada.nextInt();
		
		if(num%2 == 0) {
			return "El numero es par";
		}else if(num == 0) {
			return "El numero ni es par ni es impar";
		}else {
			return "El numero es impar";
		}
	}
	
	
	
	//---Ejercicio 24---
	
	public static int cuadradoNNumeros() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de enteros a calcular");
		int num = entrada.nextInt();
		int acc=0;
		int res=0;
		
		for(int i=1; i<=num; i++) {
			res = cuadrado(i);
			acc = acc + res;
		}
		return acc;
	}
	
	
	
	//---Ejercicio 25---
	
	public static int sumaNNumeros() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de enteros a calcular");
		int num = entrada.nextInt();
		int acc=0;
		
		for(int i=1; i<=num; i++) {
			acc = acc + i;
		}
		return acc;
	}
	
	
	//---Ejercicio 26---
	
	public static int sumaNPares() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de enteros a calcular");
		int num = entrada.nextInt();
		int acc=0;
		
		for(int i=2; i<=num; i=i+2) {
			acc = acc + i;
		}
		return acc;
	}
	
	//---Ejercicio 27---
	
	
	
	//---Ejercicio 28---
	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(fp());
		//System.out.println(esPar());
		System.out.println(sumaNPares());
	}

}
