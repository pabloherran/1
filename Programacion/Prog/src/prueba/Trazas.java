package prueba;

public class Trazas {

	public static void pintaArray(int[]array) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}



	public static void main(String args[]) {
		int TAM = 10;
		int i;
		int array[] = new int[TAM];
		array[0] = 5;
		for (i = 1; i < TAM; i++) {
			array[i] = i + array[i - 1];
		}
		
		for (i = 0; i < TAM; i++) {
			System.out.print(array[i] + " * ");
		}
		System.out.println();
		
		for (i = TAM - 2; i >= 0; i--) {
			array[i] = i + array[i];
		}
				
		for (i = 0; i < TAM; i++) {
			System.out.print(array[i] + " * ");
		}
	}
}