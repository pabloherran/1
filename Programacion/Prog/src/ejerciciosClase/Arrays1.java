package ejerciciosClase;

import java.util.Scanner;

public class Arrays1 {
	static int miGlobal = 19;

	/*
	public static void ejer1() {

	}
	 */

	public static void ejer2a(){
		Scanner sc = new Scanner(System.in);
		int longitud;
		do {
			System.out.println("Introduzca la longitud del array");
			longitud=sc.nextInt();
		}while(longitud<=0);
		int[]array1 = new int[longitud];
		for(int i=0;i<longitud;i++) {
			array1[i] = i*3;
			System.out.print(array1[i] + " ");
		}
		sc.close();
	}

	public static void ejer2b(){
		Scanner sc = new Scanner(System.in);
		int longitud;
		do {
			System.out.println("Introduzca la longitud del array");
			longitud=sc.nextInt();
		}while(longitud<=0);
		int[]array1 = new int[longitud];
		for(int i=0;i<longitud;i++) {
			array1[i] = longitud-i-1;
			System.out.print(array1[i] + " ");
		}
		sc.close();
	}

	public static void ejer2c(){
		Scanner sc = new Scanner(System.in);
		int longitud;
		do {
			System.out.println("Introduzca la longitud del array");
			longitud=sc.nextInt();
		}while(longitud<=0);
		boolean[]array1 = new boolean[longitud];
		for(int i=0;i<longitud;i++) {
			if(i%2==0) {
				array1[i] = true;
			}else {
				array1[i] = false;
			}
			System.out.print(array1[i] + " ");
		}
		sc.close();
	}


	//CuentaCeros
	public static int ejer3a(int[]a) {
		int cont=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				cont++;
			}
		}
		return cont;
	}

	//SumaPares
	public static int ejer3b(int[]a) {
		int aux=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				aux=aux+a[i];
			}
		}
		return aux;
	}

	//CuentaRepeticiones
	public static int ejer3c(int[]a, int n) {
		int cont=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				cont++;
			}
		}
		return cont;
	}

	//sustituye
	public static void ejer3d(int[]a, int nViejo, int nNuevo) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==nViejo) {
				a[i]=nNuevo;
			}
			System.out.println(a[i] + " ");
		}
		//return a;
	}

	//intercamvia valores
	public static void ejer3e1(int[]a, int n1, int n2) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n1) {
				a[i]=n2;
			}else if(a[i]==n2) {
				a[i]=n1;
			}
			System.out.print(a[i] + " ");
		}
	}

	//intercamvia posiciones
	public static void ejer3e2(int[]a, int n1, int n2) {
		int aux=0;

		aux=a[n1];
		a[n1]=a[n2];
		a[n2]=aux;

		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

	//Invierte
	public static void ejer3f(int[]a) {
		int[]acopia = new int [a.length];
		int k=0;
		for(int j=a.length-1;j>=0;j--) {
			acopia[j]=a[k];
			k++;
		}

		for(int i=0;i<a.length;i++) {
			System.out.print(acopia[i] + " ");
		}
	}

	//Rota
	public static void ejer3g(int[]a) {
		int[]acopia = new int [a.length];
		int k=0;
		for(int j=0;j<a.length;j++) {
			if(j==acopia.length-1) {
				acopia[0]=a[a.length-1];
			}else {
				acopia[j+1]=a[k];
				k++;
			}
		}

		for(int i=0;i<a.length;i++) {
			System.out.print(acopia[i] + " ");
		}
	}

	//Iguales
	public static boolean ejer3h(int[]a, int[]b) {
		if(a.length!=b.length) {
			return false;
		}

		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]){
				return false;
			}
		}
		return true;
	}



	//Numeros introducidos de prueba
	//1.5.6.7.5.6.-2.-6.-2.-5
	//Resultados 5.0 y -3.75
	public static void ejer4() {
		Scanner sc = new Scanner(System.in);
		int longitud=10;
		float resPos=0;
		float resNeg=0;
		float contPos=0;
		float contNeg=0;
		int[]a = new int[longitud];
		for(int i=0;i<longitud;i++) {
			a[i] = sc.nextInt();
		}

		for(int i=0;i<longitud;i++) {
			if(a[i]>0) {
				resPos=resPos+a[i];
				contPos++;
			}else {
				resNeg=resNeg+a[i];
				contNeg++;
			}
		}
		System.out.println(resPos/contPos);
		System.out.println(resNeg/contNeg);
		sc.close();
	}



	//Numeros introducidos de prueba
	//1.5.6.7.5.6.-2.-6.-2.-5
	//Resultados 1.6  y 1.4
	public static void ejer5() {
		Scanner sc = new Scanner(System.in);
		int longitud=10;
		float resPar=0;
		float resImp=0;
		float contPar=0;
		float contImp=0;
		int[]a = new int[longitud];
		for(int i=0;i<longitud;i++) {
			a[i] = sc.nextInt();
		}
		//System.out.println(a[0]%2);
		for(int i=0;i<longitud;i++) {
			if(i%2==0 || i==0) {
				resPar=resPar+a[i];
				contPar++;
			}else {
				resImp=resImp+a[i];
				contImp++;
			}
		}
		System.out.println(resPar/contPar);
		System.out.println(resImp/contImp);
		sc.close();
	}



	//Numeros introducidos de prueba
	//1,90+1,73+1,65+1,45+1,50
	//Resultados 1.6  y 1.4
	public static void ejer6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero de personas: ");
		int longitud = sc.nextInt();
		float[]a =  new float [longitud];

		System.out.print("Ahora introduzca la altura de las personas: ");
		for(int i=0; i<longitud; i++) {
			a[i] = sc.nextFloat();
		}

		float media=0;
		int cont=0;
		for(int i=0; i<longitud; i++) {
			media=media+a[i];
			cont++;

		}

		System.out.print("La media de altura es: " + media/cont);
		System.out.println();
		
		for(int i=0; i<longitud; i++) {
			if(a[i]>media/cont) {
				System.out.println("La persona en la posicion " + i + " esta por encima de la media, y su altura es " + a[i]);
			}
		}		
		sc.close();
	}



	public static void ejer7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero de alumnos: ");
		int longitud = Integer.parseInt(sc.nextLine());
		
		//---------ARRAY DE ALUMNOS---------
		String[]arrayAlumnos = new String[longitud];
		System.out.println("Introduzca el nombre de los alumnos: ");
		for(int i=0;i<arrayAlumnos.length;i++) {
			arrayAlumnos[i] = sc.nextLine();
		}

		
		//---------ARRAY DE NOTAS---------
		float[]arrayNotas = new float[longitud];
		System.out.println("Introduzca las notas de los alumnos: ");
		for(int i=0;i<arrayNotas.length;i++) {
			arrayNotas[i] = sc.nextFloat();
			System.out.println();
		}

		
		//---------ARRAY DE NOTAS Y ALUMNOS---------
		String[]arrayNotasYAlumnos = new String[longitud];
		for(int i=0;i<longitud;i++) {
			if(arrayNotas[i]<4.99) {
				arrayNotasYAlumnos[i] = "Suspenso";
			}else if(arrayNotas[i]>=5 && arrayNotas[i]<6.99) {
				arrayNotasYAlumnos[i] = "Bien";
			}else if(arrayNotas[i]>=7 && arrayNotas[i]<8.99) {
				arrayNotasYAlumnos[i] = "Notable";
			}else if(arrayNotas[i]>=9 && arrayNotas[i]<=10) {
				arrayNotasYAlumnos[i] = "Sobresaliente";
			}
		}

		
		escribeArrayS(arrayAlumnos);
		System.out.println();
		escribeArrayS(arrayNotas);
		System.out.println();
		escribeArrayS(arrayNotasYAlumnos);
		System.out.println();

		sc.close();
	}


	public static void escribeArrayS(String[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.printf("%-20s",a[i]);
		}
	}
	
	public static void escribeArrayS(float[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.printf("%-20s",a[i]);
		}
	}
	
	

	public static void main(String[] args) {

		//int []arraydeprueba = {2,3,4,8,9,6};
		//int []arraydeprueba2 = {2,3,4,8,9,6};

		//System.out.println("---------------- Ejercicio 1 ----------------");
		//ejer1();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 2A ----------------");
		//ejer2a();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 2B ----------------");
		//ejer2b();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 2C ----------------");
		//ejer2c();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3a ----------------");
		//ejer3a();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3b ----------------");
		//ejer3b();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3c ----------------");
		//ejer3c();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3d ----------------");
		//ejer3d();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3e1 ----------------");
		//ejer3e1(arraydeprueba, 2,5);
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3e2 ----------------");
		//ejer3e2(arraydeprueba, 2,5);
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3f ----------------");
		//ejer3f(arraydeprueba);
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3g ----------------");
		//ejer3g(arraydeprueba);
		//System.out.println();

		//System.out.println("---------------- Ejercicio 3h ----------------");
		//System.out.println(ejer3h(arraydeprueba, arraydeprueba2));
		//System.out.println();

		//System.out.println("---------------- Ejercicio 4 ----------------");
		//ejer4();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 5 ----------------");
		//ejer5();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 6 ----------------");
		//ejer6();
		//System.out.println();

		//System.out.println("---------------- Ejercicio 7 ----------------");
		//ejer7();
		//System.out.println();
	}

}
