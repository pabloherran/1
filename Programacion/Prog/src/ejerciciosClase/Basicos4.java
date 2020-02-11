package ejerciciosClase;

import java.util.Scanner;

public class Basicos4 {

	public static void numeroNeg() {
		Scanner sc = new Scanner(System.in);
		int numUser;
		int cont=0;
		do {
			System.out.println("Introduzca un numero.");
			numUser = sc.nextInt();
			cont++;
		}while(numUser>0);

		if(cont == 1) {
			System.out.println("Has salido del bucle con tu numero negativo, has empleado " + cont + " intento");
		}else {
			System.out.println("Has salido del bucle con tu numero negativo, has empleado " + cont + " intentos");
		}
		sc.close();
	}

	public static void salario() {
		Scanner sc = new Scanner(System.in);
		int sueldo=0;
		String opcion = "Si";

		if(opcion.equalsIgnoreCase("si")) {
			do {
				System.out.println("Introduzca el numero de horas trabajadas: ");
				int horas = Integer.parseInt(sc.nextLine());
				if(horas<35) {
					sueldo = horas * 15;
					System.out.println("Su sueldo este mes es: "+sueldo+"€");
				}else {
					sueldo = 35*15 + ((horas-35)*22);
					System.out.println("Su sueldo este mes es: "+sueldo+"€");
				}
				System.out.println("¿Quiere realizar la comprobacion de otro sueldo?");
				opcion = sc.nextLine();
			}while(opcion.equalsIgnoreCase("Si"));
		}
		System.out.println("Hasta luego");
		sc.close();
	}

	public static boolean esPrimo(int n) {
		int i=2;
		for (i=2; i<n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}


	public static void nPrimos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero maximo a comprobar: ");
		int a = sc.nextInt();
		int cont=0;
		String res="";
		for (int i=2;i<a;i++) {
			if(esPrimo(i)) {
				res = res + " " + i;
				cont++;
			}
		}
		System.out.println(res);
		System.out.println("El numero de primos es " + cont);
		sc.close();
	}

	public static void numeroMayor() {
		Scanner sc = new Scanner(System.in);
		int numUser;
		int numMayor;
		int cont=0;
		do {
			System.out.println("Introduzca un numero.");
			numUser = sc.nextInt();
			cont++;
			numMayor=numUser;
			if(numMayor<numUser){
				numMayor = numUser;
			}
		}while(numUser>0);



		if(cont == 1) {
			System.out.println("Has salido del bucle con tu numero negativo, has empleado " + cont + " intento. Y el numero que mas se ha repetido es: "  );
		}else {
			System.out.println("Has salido del bucle con tu numero negativo, has empleado " + cont + " intentos");
		}
		sc.close();
	}


	public static void notasAlumno() {
		Scanner sc = new Scanner(System.in);
		double NF = 6.0;
		double N3 = 0.0;


		System.out.println("Introduzca la nota del primer examen");
		double N1 = sc.nextDouble();
		System.out.println("Introduzca la nota del segundo examen");
		double N2 = sc.nextDouble();
		System.out.println("Introduzca la nota del laboratorio");
		double NL = sc.nextDouble();

		N3 = (((NF-(NL*0.3))/0.7)*3)-N1-N2;

		System.out.println("La nota que necesita en el tercer examen para aprobar es " + N3);
		sc.close();
	}


	public static void secuenciaCollatzBuena(int num) {
		for(int n=1;n<=num;n++) {
			int aux=n;
			int cont=0;
			while(aux>1) {
				if(aux==1) {
					//System.out.print(aux+ " ");
					cont++;
				}else if(aux%2==0) {
					//System.out.print(aux +" ");
					aux=aux/2;
					cont++;
				}else {
					//System.out.print(aux +" ");
					aux=(aux*3)+1;
					cont++;
				}
			}
			cont=cont+1;
			//System.out.println("1");

			for (int i=0;i<cont;i++) {
				System.out.print("*" + " ");
				if(i==cont-1) {
					System.out.println();
				}
			}
		}
	}
	

	public static void main(String[] args) {
		//numeroNeg();
		//salario();
		//nPrimos();
		//numeroMayor();
		//notasAlumno();
		//asteriscos(5);
		//secuenciaCollatz(20);
		//secuenciaCollatzAsteriscos();
		//secuenciaCollatzBuena(5);
	}

}
