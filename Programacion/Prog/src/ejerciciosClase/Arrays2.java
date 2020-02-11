package ejerciciosClase;

import java.util.Scanner;

public class Arrays2 {
	
	public static long digitos(long num) {
		int cont=0;
		while(num>0) {
			num=num/10;
			cont++;
		}
		return cont;
	}
	
	public static String asteriscos(int n) {
		String asteriscos = "";
		
		for(int i=0; i<n; i++) {
			asteriscos = asteriscos + "*";
		}
		return asteriscos;
	}
	
	public static int darVueltaNumero(int n) {
		int invertido=0;
		int resto;
		while(n>0) {
			resto= n%10;
			invertido = invertido*10 + resto;
			n /= 10;
		}
		return invertido;
	}
	
	
	public static void ejer1() {
		int longitud=100;
		int[]a=new int[longitud];
		
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j] + " ");
		}
	}
	
	public static void ejer2() {
		Scanner sc = new Scanner(System.in);
		int longitud=10;
		int[]a = new int[longitud];
		
		for (int i=0;i<a.length;i++) {
			a[i] = (int) Math.floor(Math.random()*99+1);
		}
		
		System.out.print("Introduzca la posicion que desea visualizar: ");
		int posicion = sc.nextInt();
		System.out.println(a[posicion]);
		sc.close();
	}
	
	public static void ejer3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la longitud del array: ");
		int longitud = sc.nextInt();
		
		int[]a = new int[longitud];
		
		for (int i=0;i<a.length;i++) {
			a[i] = (int) Math.floor(Math.random()*299+1);
		}
		
		int num;
		do {
			System.out.print("Introduzca el numero a buscar: ");
			num = sc.nextInt();
		}while(num<=0);
		
		
		int cont=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%10==num) {
				cont++;
			}
		}
		
		int[]aAux = new int[cont];
		int pos=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%10 == num) {
				aAux[pos] = a[i];
				pos++;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		
		for(int i=0; i<aAux.length; i++) {
			System.out.print(aAux[i] + " ");
		}
		sc.close();
	}
	
	
	public static void ejer4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero de su DNI: ");
		int DNI = sc.nextInt();
		int res = (int) (DNI%23);
		char[]a = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println("Su DNI es " + DNI + a[res]);
		sc.close();
	}
	
	public static void ejer5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		int longitud = (int) digitos(num);
		int numAux = darVueltaNumero(num);
		int[]a1 = new int[longitud];
		int[]a2 = new int[longitud];
		
		for(int i=0; i<a1.length; i++) {
			a1[i] = numAux%10;
			numAux = numAux/10;
		}
		
		for(int i=0;i<a2.length;i++) {
			a2[i] = num%10;
			num = num/10;
		}
		
		System.out.println();
		
		boolean flag = true;
		int cont = 0;
		
		while(cont<a1.length && flag) {
			if(a1[cont]!=a2[cont]) {
				flag=false;
			}
			cont++;
		}
		
		if(flag) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
		sc.close();
	}
	
	public static void ejer6() {
		int longitud=100;
		int[]a = new int[longitud];
		
		for (int i=0;i<a.length;i++) {
			a[i] = (int) Math.floor(Math.random()*10+1);
		}
		int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0, cont8=0, cont9=0, cont10=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				cont1++;
			}else if(a[i]==2) {
				cont2++;
			}else if(a[i]==3) {
				cont3++;
			}else if(a[i]==4) {
				cont4++;
			}else if(a[i]==5) {
				cont5++;
			}else if(a[i]==6) {
				cont6++;
			}else if(a[i]==7) {
				cont7++;
			}else if(a[i]==8) {
				cont8++;
			}else if(a[i]==9) {
				cont9++;
			}else if(a[i]==10) {
				cont10++;
			}
		}
		
		System.out.println("1:  " + asteriscos(cont1));
		System.out.println("2:  " + asteriscos(cont2));
		System.out.println("3:  " + asteriscos(cont3));
		System.out.println("4:  " + asteriscos(cont4));
		System.out.println("5:  " + asteriscos(cont5));
		System.out.println("6:  " + asteriscos(cont6));
		System.out.println("7:  " + asteriscos(cont7));
		System.out.println("8:  " + asteriscos(cont8));
		System.out.println("9:  " + asteriscos(cont9));
		System.out.println("10 :" + asteriscos(cont10));
	}
	
	public static void main(String[] args) {
		//ejer1();
		//ejer2();
		//ejer3();
		//ejer4();
		//ejer5();
		//ejer6();
	}

}
