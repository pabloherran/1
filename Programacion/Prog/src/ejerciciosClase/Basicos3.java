package ejerciciosClase;

import java.util.Scanner;

public class Basicos3 {

	public static void acertar() {
		int numAleatorio = (int) (Math.random()*200+1); 
		int cont = 0;
		int numUser;
		final int intentos = 20;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero entre 1 y 200.");
			numUser = sc.nextInt();
			if(numUser>200) {
				System.out.println("Introduzca un numero mayor de 0 y menor de 200");
			}
			if(numUser<numAleatorio && cont<intentos){
				System.out.println("El numero es mayor");
			}else if(numUser>numAleatorio && cont<intentos) {
				System.out.println("El numero es menor");
			}
			cont++;
		}while(numUser!=numAleatorio || cont>intentos);
		
		if(numUser==numAleatorio && cont<5) {
			System.out.println("Has acertado crack en " + cont + " intentos.");
		}else if(numUser==numAleatorio && cont<10) {
			System.out.println("Has acertado crack en " + cont + " intentos.");
		}else if(numUser==numAleatorio && cont<15) {
			System.out.println("Has acertado crack en " + cont + " intentos.");
		}else if(numUser==numAleatorio && cont>20) {
			System.out.println("Has fallado por superar el numero de intentos.");
		}
		
		sc.close();
	}
	
	public static void numAmigos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int b = sc.nextInt();
		int res1 = 0, res2 = 0;
		
		for (int i=1;i<=a;i++) {
			if(a%i==0) {
				res1=res1+i;
			}
		}
		
		for (int i=1;i<=b;i++) {
			if(b%i==0) {
				res2=res2+i;				
			}
		}
		
		if(res1==res2) {
			System.out.println("Los numeros son amigos");
		}else {
			System.out.println("Los numeros no son amigos");
		}
		sc.close();
	}
	
	public static void numPerfectos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = sc.nextInt();
		int res1=0;
		for (int i=1;i<a;i++) {
			if(a%i==0) {
				res1=res1+i;
			}
		}
		if(res1==a) {
			System.out.println("El numero es perfecto");
		}else {
			System.out.println("El numero no es perfecto");
		}
		sc.close();
	}
	
	
	public static void tarot() {
		System.out.println("Ahora deberas introducir la fecha de tu nacimiento");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el dia");
		int dia = sc.nextInt();
		System.out.println("Introduzca el mes");
		int mes = sc.nextInt();
		System.out.println("Introduzca el año");
		int año = sc.nextInt();
		
		int resParcial = 0;
		int resParcial2 = 0;
		int resFinal = 0;
		
		resParcial=dia+mes+año;
		
		for(int i=0;i<4;i++) {
			resParcial2=resParcial2+resParcial%10;
			resParcial = resParcial/10;
		}
		
		for(int i=1;i<=2;i++) {
			resFinal=resFinal+resParcial2%10;
			resParcial2 = resParcial2/10;
		}
		System.out.println("Su numero del tarot es : " + resFinal);
		sc.close();
	}
	
	public static void ejer3() {
		 int n1 = (int)(Math.random()*10);
		 int n2 = (int)(Math.random()*10);
		 int n3 = (int)(Math.random()*10);
		 String num1, num2, num3;
		 
		if(n1==3) {
			num1="E";
		}else {
			num1 = "" + n1;
		}
		
		if(n2==3) {
			num2="E";
		}else {
			num2 = "" + n2;
		}
		
		if(n3==3) {
			num3="E";
		}else {
			num3 = "" + n3;
		}
		
		System.out.println(num1 + "-" + num2 + "-" + num3);
	}
	
	
	public static void main(String[] args) {
		//acertar();
		//numAmigos();
		//numPerfectos();
		//tarot();
		//ejer3();
	}

}
