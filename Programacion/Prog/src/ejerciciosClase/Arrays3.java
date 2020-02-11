package ejerciciosClase;

//import java.util.Scanner;

public class Arrays3 {
	
	public static int[][] rellenaMatriz(int[][]a){
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*100+1);
			}
		}
		return a;
	}


	public static void muestraMatriz(int[][]a){
		System.out.println("MATRIZ");
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%-5s",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void numMayor(int[][]a) {
		int mayor = a[0][0];
		int posmayorfila = a[0][0];
		int posmayorcolumna = a[0][0];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]>mayor) {
					mayor = a[i][j];
					posmayorfila = i;
					posmayorcolumna = j;
				}
				
			}
		}
		System.out.println();
		System.out.println("El mayor numero es " + mayor + " y la posicion es :" + "\n" + "FILA:" +  (posmayorfila+1) + "\n" + "COLUMNA: " +  (posmayorcolumna+1));
	}
	
	
	public static void numMenor(int[][]a) {
		int menor = a[0][0];
		int posmenorfila = a[0][0];
		int posmenorcolumna = a[0][0];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]<menor){
					menor = a[i][j];
					posmenorfila = i;
					posmenorcolumna = j;
				}
			}
		}
		System.out.println();
		System.out.println("El menor numero es " + menor + " y la posicion es :" + "\n" + "FILA:" +  (posmenorfila+1) + "\n" + "COLUMNA: " +  (posmenorcolumna+1));
	}



	public static void main(String[] args) {
		int[][] a = new int[5][4];
		rellenaMatriz(a);
		muestraMatriz(a);
		numMayor(a);
		numMenor(a);
	}

}
