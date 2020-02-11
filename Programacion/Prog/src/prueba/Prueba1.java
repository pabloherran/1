package prueba;

import java.util.Scanner;

public class Prueba1 {

	private static Scanner entrada;

	
	
	
	
	//---------------------------------------- PROGRAMAS DE PRUEBA ----------------------------------------
	
	public static String mayorEdad() {
		entrada = new Scanner(System.in);
		int edad = entrada.nextInt();
		entrada.nextLine();
	
		if(edad<18) {
			return "No eres mayor de edad.";
		}else {
			return"Eres mayor de edad";
		}
	}
	
	
	
	public static int sueldo(int i) {
		entrada = new Scanner(System.in);
		int res;
		int sueldo_hora = 10;
		int horas_trabajadas = entrada.nextInt();
		res = horas_trabajadas*sueldo_hora;
		
		
		if(horas_trabajadas<=0) {
			return 0;
		}else if(horas_trabajadas>40){
			return res + (horas_trabajadas-40)*((sueldo_hora*50)/100);
			}		
			else
				return res;
	}
	
	
	
	public static int salarioTrabajadores() {
		int res = 0;
		int aux = 0;
		int acc = 0;
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
	
	
	
	public static String maximo(int x, int y) {
		entrada = new Scanner(System.in);
		
		if(x<y) {
			return "El maximo es " + y;
		}else if(x>y) {
			return "El maximo es " + x;
		}else
			return "Son iguales";
	}
	
	
	
	public static String comparadorSueldos() {
		int x;
		int y;
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer sueldo");
		int sueldo1 = entrada.nextInt();
		System.out.println("Introduzca el segundo sueldo");
		int sueldo2 = entrada.nextInt();
		
		x = sueldo1;
		y = sueldo2;
		
		if(x<y) {
			return "El sueldo mayor es " + y;
		}else if(x>y) {
			return "El sueldo mayor es " + x;
		}else
			return "Son iguales";
	}
	
	
	
	public static int areaCuadrado (int lado){
		return lado^2;
	}
	
	
	
	public static String areaMayor(int l1, int l2) {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer lado");
		l1 = entrada.nextInt();
		System.out.println("Introduzca el segundo lado");
		l2 = entrada.nextInt();
		
		l1 = areaCuadrado(l1);
		l2 = areaCuadrado(l2);
		
		if(l1>l2){
			return "El cuadrado 1 es mayor";
		}else if(l2>l1) {
			return "El cuadrado 2 es mayor";
		}else
			return"Son iguales";
	}
	
	public static boolean expresion1() {
		entrada = new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduzca el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = entrada.nextInt();
		
		if(num1>=1 && num2<=10){
			return true;
		}else {
			return false;
		}		
	}
	
	
	public static boolean expresion2() {
		entrada = new Scanner(System.in);
		int num1, num2, num3, num4;
		System.out.println("Introduzca el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = entrada.nextInt();
		System.out.println("Introduzca el tercer numero");
		num3 = entrada.nextInt();
		System.out.println("Introduzca el cuarto numero");
		num4 = entrada.nextInt();
		
		if(num1<1 || num2>3 && num3<5 || num4>7){
			return false;
		}else {
			return true;
		}		
	}
	
	
	public static int diaSemana() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de la semana");
		int day = entrada.nextInt();
		switch (day) {
		  case 1:
		    System.out.println("Lunes");
		    break;
		  case 2:
		    System.out.println("Martes");
		    break;
		  case 3:
		    System.out.println("Miercoles");
		    break;
		  case 4:
		    System.out.println("Jueves");
		    break;
		  case 5:
		    System.out.println("Viernes");
		    break;
		  case 6:
		    System.out.println("Sabado");
		    break;
		  case 7:
		    System.out.println("Domingo");
		    break;
		}
		return day;
	}
	
	
	public static int estaciones() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero del mes");
		int mes = entrada.nextInt();
		if(mes<1 || mes >12) {
			System.out.println("El numero de mes no se corresponde, por favor elija un mes entre 1 y 12");
		}else {
			switch (mes) {
			  case 1:
			    System.out.println("Invierno");
			    break;
			  case 2:
			    System.out.println("Invierno");
			    break;
			  case 3:
			    System.out.println("Primavera");
			    break;
			  case 4:
			    System.out.println("Primavera");
			    break;
			  case 5:
			    System.out.println("Primavera");
			    break;
			  case 6:
			    System.out.println("Verano");
			    break;
			  case 7:
			    System.out.println("Verano");
			    break;
			  case 8:
				System.out.println("Verano");
				break;
			  case 9:
				System.out.println("Otoño");
				break;
			  case 10:
				 System.out.println("Otoño");
				break;
			  case 11:
				System.out.println("Otoño");
				break;
			  case 12:
				System.out.println("Invierno");
				break;
			}
		}
		return mes;
	}


	
	
	public static void main(String[] args) {
		//System.out.println("Introduzca las horas trabajadas:");
		//System.out.println(sueldo());
		//System.out.println("Introduzca su edad");
		//System.out.println(mayorEdad());
		//System.out.println(salarioTrabajadores());
		//System.out.println(factura());
		//System.out.println(comparadorSueldos());
		//System.out.println(comparadorSueldos());
		//System.out.println(comparadorSueldos());
		//System.out.println(areaMayor(0,0));
		//System.out.println(diaSemana());
		//System.out.println(estaciones());
	}

}