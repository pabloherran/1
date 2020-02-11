package ejerciciosClase;

import java.util.Scanner;

public class Basicos2 {

	
	public static void ciudades() {
		double a = 3.5;
		double b = 5;
		int anios=0;
		while(a<=b) {
			anios++;
			a=a*1.07;
			b=b*1.05;
		}
		System.out.println(1980+anios);
	}
	
	
	public static void sumaSucesivas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int b = sc.nextInt();
		int res=0;
		for(int i=0;i<b;i++){
			res=res+a;
			System.out.print(b + (i!=b?"+":""));
		}
		System.out.println();
		System.out.println("El producto de " + a + "*" + b + " es " + res);
		sc.close();
	}
	
	public static void restasSucesivas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int b = sc.nextInt();
		
		int aux=0;
		
		if(a<b) {
			aux=a;
			a=b;
			b=aux;
		}
		int res=0;
		for(;a>=b;){
			a=a-b;
			res++;
		}
		System.out.println(res);
		sc.close();
	}
	
	public static void exponente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		long a = sc.nextInt();
		long b;
		do{
			System.out.println("Introduzca el segundo numero");
			b = sc.nextInt();
		}while(b<=0);
		
		long res=1;
		for(int i=0;i<b;i++){
			res=res*a;
			System.out.print(a + (i!=b-1?"*":""));
		}
		System.out.println();
		System.out.println("El producto de " + a + "^" + b + " es " + res);
		sc.close();
	}
	
	public static void darlavuelta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int a = sc.nextInt();
		int aux = 0;
		int cont = 0;
		int res = 0;
		
		do {
			res=a/10;
			cont++;
		}while(res>=1);
		
		
		for(int i=0; i<cont;i++) {
			aux=a%10;
			res= res + (int) (aux*Math.pow(10, cont-i));
		}
		System.out.println(res);
		sc.close();
	}
	
	
	
	public static int cuadrado(int a) {
		return (int) Math.pow(a, 2);
	}
	
	public static int cubo(int a) {
		return (int) Math.pow(a, 3);
	}
	
	public static void ejer8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int a = sc.nextInt();
		for (int i=1;i<=a;i++) {
				System.out.println(i +" "+ cuadrado(i) +" "+ cubo(i));
		}
		sc.close();
	}
	
	
	
	
	public static void main(String[] args) {
		//ciudades();
		//sumaSucesivas();
		//restasSucesivas();
		//exponente();
		//darlavuelta();
		ejer8();
		
	}

}
