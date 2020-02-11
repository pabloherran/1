package ejerciciosClase;

import java.util.Scanner;

public class EjerciciosCadenas {

	//--------------------------------------------------FUNCIONES AUXILIARES--------------------------------------------------

	public static boolean esCapicua(int n) {

		String strNum = Integer.toString(n);
		boolean esCapicua = true;
		int longi = strNum.length();

		for (int i=0;i<longi/2;i++) {
			if(strNum.charAt(i)!=strNum.charAt(longi-1-i)) {
				esCapicua=false;
			}
		}		
		return esCapicua;
	}

	public static boolean esCapicua2(int n) {
		String num= Integer.toString(n);		
		StringBuilder str = new StringBuilder(num);
		StringBuilder num1;
		boolean capicua=false;
		num1=str.reverse();

		if(num.equalsIgnoreCase(num1.toString())) {
			return true;
		}
		return capicua;
	}
	/*
	public static String espejo1() {

	}

	public static String espejo2() {

	}
	 */
	
	public static String reemplazar(String cadena) {
		cadena = cadena.toUpperCase();
		return cadena;
	}


	public static void contador() {

	}

	//--------------------------------------------------EJERCICIOS--------------------------------------------------



	public static void ejer1() {
		Scanner sc = new Scanner(System.in);
		String aux="";
		String palabra;
		char letra;
		int vocal=0;
		int vocalAux=0;
		for(int i=0;i<3;i++) {
			System.out.println("Introduce la cadena:");
			palabra = sc.nextLine();
			vocal=0;
			for(int j=0;j<palabra.length();j++) {
				letra=palabra.charAt(j);
				if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' || letra=='á' || letra=='é' || letra=='í' || letra=='ó' || letra=='ú' || letra=='ü') {
					vocal++;
				}
			}
			if(vocal>vocalAux && aux.length()<palabra.length()) {
				aux=palabra;
				vocalAux=vocal;
			}

		}
		System.out.println("La palabra con mayor numero de vocales es " + aux + " y el numero de vocales es " + vocalAux);
		sc.close();
	}


	public static void ejer2a() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		//int num = sc.nextInt();


		sc.close();
	}

	public static void ejer2b() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cadena");
		int num = sc.nextInt();

		if(esCapicua2(num)) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
		sc.close();
	}

	public static String ejer3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la palabra");
		String cadena = sc.nextLine();
		String cadenaAux="";
		sc.close();
		for(int i=cadena.length()-1;i>=0;i--) {
			cadenaAux=cadenaAux+cadena.charAt(i);
		}
		return cadenaAux;
	}

	public static void ejer3b() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cadena");
		String cadena = sc.nextLine();

		StringBuilder str = new StringBuilder(cadena);
		System.out.println("A la inversa, la palabra " + cadena + " es " + str.reverse());
		sc.close();
	}

	public static void ejer4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la palabra");
		sc.close();
	}

	public static void ejer5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cadena");
		String cadena = sc.nextLine();
		System.out.println("Introduzca la subcadena a buscar");
		String cadena2 = sc.nextLine();
		int cont = 0;
		while (cadena.indexOf(cadena2) > -1) {
			cadena = cadena.substring(cadena.indexOf(cadena2)+cadena2.length(),cadena.length());
			cont++; 
		}
		System.out.println (cont);
		sc.close();
	}	

	public static void ejer6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cadena");
		String cadena = sc.nextLine();
		System.out.println("Introduzca la subcadena a buscar");
		String cadena2 = sc.nextLine();
		String cadenaAux = cadena;
		while (cadena.indexOf(cadena2) > -1) {
			cadena = cadena.substring(cadena.indexOf(cadena2)+cadena2.length(),cadena.length());
			cadena = cadenaAux.replaceAll(cadena2, reemplazar(cadena2));
		}
		System.out.println(cadena);
		sc.close();
	}



	public static void main(String[] args) {
		//ejer1();
		//ejer2();
		//ejer2b();
		//ejer3();
		//ejer3b();
		//ejer5();
		//ejer6();
	}
}
