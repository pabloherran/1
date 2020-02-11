package ejerciciosClase;

import java.util.Scanner;

public class Matrices {

	public static void ejer1(){
		int[][] a = new int[4][4];
		int[][] b = new int[4][4];
		int[][] c = new int[4][4];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*10);
			}
		}

		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length;j++) {
				b[i][j] = (int) (Math.random()*10);
			}
		}

		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("MATRIZ");
		System.out.println();

		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length;j++) {
				System.out.printf("%-5s",c[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}



	public static void split() {
		String[][] a = new String[4][4];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = Integer.toString((int) (Math.random()*10));
			}
		}

		String cadena = "";
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				cadena = cadena + a[i][j];
			}
			if(i==a.length) {
				cadena = cadena + "";
			}else {
				cadena = cadena + "-";
			}

		}
		System.out.println(cadena);

		String [] split = cadena.split("-");

		for(int i=0; i<split.length; i++) {
			System.out.println(split[i]);
		}


		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {

			}
		}

		/*
		System.out.println("MATRIZ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		 */
	}



	public static void ejer2() {
		int[][] a = new int[4][5];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*10);
			}
		}
		int posFila = a[0][0];
		int posColumna = a[0][0];
		int num = (int) (Math.random()*10);

		System.out.println("NUMERO A BUSCAR");
		System.out.println(num);
		System.out.println();
		System.out.println("MATRIZ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		int i=0;
		boolean flag=false;
		while(i<a.length && !flag) {
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]==num) {
					posFila = i;
					posColumna = j;
					flag = true;
				}
			}
			i++;
		}
		System.out.println("Fila: " + (posFila+1) + "\n" + "Columna: " + (posColumna+1));
	}


	public static void ejer3() {
		int[][] a = new int[8][8];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*10);
			}
		}

		int[][] b = new int [a.length][a.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				b[i][j] = a[i][j];
			}
		}

		System.out.println("Matriz A");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Matriz B");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length;j++) {
				System.out.printf("%-5s",b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void ejer4() {
		int[][] a = new int[6][8];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*100+1);
			}
		}

		System.out.println("MATRIZ");
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();


		int mayor = a[0][0];
		int posmayorfila = a[0][0];
		int posmayorcolumna = a[0][0];
		int menor = a[0][0];
		int posmenorfila = a[0][0];
		int posmenorcolumna = a[0][0];

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]>mayor) {
					mayor = a[i][j];
					posmayorfila = i;
					posmayorcolumna = j;
				}
				if(a[i][j]<menor){
					menor = a[i][j];
					posmenorfila = i;
					posmenorcolumna = j;
				}

			}
		}
		System.out.println();
		System.out.println("El mayor numero es " + mayor + " y la posicion es :" + "\n" + "FILA:" +  (posmayorfila+1) + "\n" + "COLUMNA: " +  (posmayorcolumna+1));
		System.out.println();
		System.out.println("El menor numero es " + menor + " y la posicion es :" + "\n" + "FILA:" +  (posmenorfila+1) + "\n" + "COLUMNA: " +  (posmenorcolumna+1));
	}


	public static void ejer5() {
		int[][] a = new int[5][5];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*10+1);
			}
		}

		System.out.println("Matriz original");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		int suma=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if(j>i) {
					a[i][j] = (int) Math.pow(a[i][j], 2);
				}else if(i>j) {
					suma = suma + a[i][j];
				}else if(i==j){
					a[i][j] = a[i][j] + 1;
				}
			}
		}
		System.out.println();
		System.out.println(suma);
		System.out.println();

		System.out.println("Matriz modificada");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();


		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if((i+j)==(a.length-1)){
					a[i][j] = a[i][j]*2;
				}
			}
		}

		System.out.println("Matriz modificada 2");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void ejer6() {
		int[][] a = new int[4][5];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*10+1);
			}
		}

		int sumafilas = 0;
		int[]sumacolumnas = new int[5];

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				sumafilas = sumafilas + a[i][j];
				System.out.print(a[i][j] + "\t");
				sumacolumnas[j] = sumacolumnas[j] + a[i][j];
			}
			System.out.println(sumafilas);
			sumafilas = 0;
		}

		for(int i=0; i<sumacolumnas.length; i++) {
			System.out.print(sumacolumnas[i] + "\t");
		}
	}

	public static void ejer7() {
		int aux = 0;
		int[][] a = new int[4][4];

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*10+1);
			}
		}

		System.out.println("Original");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if(i>j) {
					aux = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = aux;
				}
			}
		}

		System.out.println("Trapuesta sobre original");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();



		int[][] copia = new int[4][4];
		for(int i=0; i<copia.length; i++) {
			for(int j=0; j<copia[i].length;j++) {
				copia[i][j] = a[j][i];
			}
		}

		System.out.println("Traspuesta con creacion de nueva matriz");
		for(int i=0; i<copia.length; i++) {
			for(int j=0; j<copia[i].length;j++) {
				System.out.printf("%-5s",copia[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void ejer8() {
		Scanner sc = new Scanner(System.in);

		String[]nombres = new String[3];
		String[]apellidos1 = new String[3];
		String[]apellidos2 = new String[3];
		String[]nombreyapellidos = new String[3];

		for (int i=0;i<nombres.length;i++) {
			nombres[i] = sc.nextLine();
		}
		for (int i=0;i<apellidos1.length;i++) {
			apellidos1[i] = sc.nextLine();
		}
		for (int i=0;i<apellidos2.length;i++) {
			apellidos2[i] = sc.nextLine();
		}
		for (int i=0;i<nombreyapellidos.length;i++) {
			nombreyapellidos[i] = nombres[i] + " " + apellidos1[i] + " " + apellidos2[i];
		}
		/*for(int i=0; i<nombreyapellidos.length; i++) {
			System.out.print(nombreyapellidos[i] + " ");
		}*/

		String[][] mNombres = new String[3][3];
		for(int i=0; i<mNombres.length; i++) {
			for(int j=0; j<mNombres[i].length;j++) {
				if(i==0) {
					mNombres[i][j] = nombres[j];
				}else if(i==1) {
					mNombres[i][j] = apellidos1[j];
				}else {
					mNombres[i][j] = apellidos2[j];
				}

			}
		}

		for(int i=0; i<mNombres.length; i++) {
			for(int j=0; j<mNombres[i].length;j++) {
				System.out.printf("%-10s",mNombres[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		sc.close();
	}


	public static void ejer9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero de equipos: ");
		int numEquipos = sc.nextInt();
		System.out.print("Introduzca el numero de jugadores por equipo: ");
		int numJugadores = sc.nextInt();
		
		int[][] a = new int[numEquipos][numJugadores];

		//Creacion de los equipos con los jugadores. Alturas entre, 150cm y 220cm
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*70+150);
			}
		}

		//Visualizacion de los equipos con sus jugadores en forma de matriz
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.print("Equipo " + (i+1) + ": ");
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();


		//Media de estaturas por equipo y medias de equipos
		int sumMedia = 0;
		int media = 0;
		int mayorMedia = 0;
		int equipo = 0;
		//jugador mas alto
		int[] aMasAlto = new int[numEquipos];
		int masAlto = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				sumMedia = sumMedia + a[i][j];
				if(masAlto < a[i][j]){
					masAlto = a[i][j];
				}
				aMasAlto[i] = masAlto; 
			
			}
			media = sumMedia/a[0].length;
			System.out.println();
			System.out.println("Media equipo " + (i+1) + ": " + media);
			
			System.out.println("El jugador mas alto del equipo " + (i+1)+ " mide: " +  aMasAlto[i] + "cm");
			
			if(mayorMedia < media) {
				mayorMedia = media;
				equipo = (i+1);
			}
			
			sumMedia = 0;
			media = 0;
			masAlto = 0;
		}
		
		System.out.println();
		System.out.println("El equipo con mayor media es " + equipo + " y su media es " + mayorMedia + "cm.");
		
		System.out.println();
		//Impresion del equipo con los jugadores mas altos
		System.out.println("El equipo con mayores alturas es: ");
		
		for(int i=0; i<aMasAlto.length; i++) {
			System.out.print(aMasAlto[i] + "cm  ");
		}
		sc.close();
	}


	public static void main(String[] args) {
		//ejer1();
		//split();
		//ejer2();
		//ejer3();
		//ejer4();
		//ejer5();
		//ejer6();
		//ejer7();
		//ejer8();
		//ejer9();
	}

}
