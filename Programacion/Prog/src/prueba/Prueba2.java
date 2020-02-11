package prueba;

import java.util.Scanner;

public class Prueba2 {

	private static Scanner entrada;

	
	// ----- Operaciones basicas -----
	
	/*public static void fibonacci() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de cifras de la serie que quiere obtener");
		int a = entrada.nextInt();
		
		for(int i=0; i<=a;i++) {
			int acc1 = i;
			int acc2 = 1;
			System.out.println(acc1 + "," + acc2);
			acc1 = acc2;
			acc2 = acc1 + acc2;
		}
	}*/
	
	public static float suma() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		int b = entrada.nextInt();
		return a + b;
	}

	public static float suma2(int a , int b) {
		return a+b;
	}
	
	public static float resta() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		int b = entrada.nextInt();
		return a - b;
	}

	public static float resta2(int a , int b) {
		return a+b;
	}
	
	public static float multiplica() {
		
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		int b = entrada.nextInt();
		return a * b;
	}
	
	public static float multiplica2(int a, int b) {
		return a*b;
	}

	public static float divide() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int a = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		int b = entrada.nextInt();
		return a / b;
	}

	public static float divide2(int a, int b) {
		return a/b;
	}
	
	public static int factorial() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int a = entrada.nextInt();
		int acc = a;
		if(a==0 || a==1) {
			return 1;
		}else {
			for(int i=1;i<=a;i++) {
				a=a-1;
				acc = acc*a;
			}
		}
		return acc;
	}

	public static boolean esPrimo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número:");
		int n = sc.nextInt();
		int i=2;
		for (i=2; i<n; i++) {
			if (n%i == 0) {
				return false;
			}
			sc.close();
		}
		return true;
	}
	
	public static void tabla() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int a = entrada.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(a + "x" + i + "=" + multiplica2(a, i));
		}
	}
	
	public static float areaCirculo() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el radio");
		int a = entrada.nextInt();
		return (float) (3.14 * Math.pow(a, 2)); 
		
	}
	
	public static float areaTriangulo() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la base");
		int a = entrada.nextInt();
		System.out.println("Introduzca la altura");
		int b = entrada.nextInt();
		
		return (a*b)/2;
	}

	public static float areaRectangulo() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer lado");
		int a = entrada.nextInt();
		System.out.println("Introduzca el segundo lado");
		int b = entrada.nextInt();
		
		return a*b;
	}
	
	
	// ----- Metodos -----
	
 	public static void bucleNVeces(int N) {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de veces a repetir");
		N = entrada.nextInt();

		for (int i = 0; i <= N; i++) {
			System.out.println("Modulo ejecutandose " + N + " veces");
		}
	}
	
	public static void operacionesBasicas() {
		System.out.println(suma());
		System.out.println(resta());
		System.out.println(multiplica());
		System.out.println(divide());
	}
	
	public static void operaciones() {
		
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la operacion que quiere realizar: suma, resta, multiplicacion, division o factorial");
		String operacion;
		
		do {
			
			operacion = entrada.nextLine();
			operacion = operacion.toLowerCase();
			
			if(operacion.equalsIgnoreCase("suma")||operacion.equalsIgnoreCase("resta")||operacion.equalsIgnoreCase("multiplicacion")||operacion.equalsIgnoreCase("division")||operacion.equalsIgnoreCase("factorial")) {
				switch (operacion) {
				  case ("suma"):
					  System.out.println(suma());
				  break;
				  case ("resta"):
					  System.out.println(resta());
				  break;
				  case ("multiplicacion"):
					 System.out.println(multiplica());
				  break;
				  case ("division"):
					 System.out.println(divide());
				  break;
				  case ("factorial"):
					 System.out.println(factorial());
				  break;
				}
			}else {
				System.out.println("Introduzca una operacion correcta");
			}
			
		}while(!(operacion.equalsIgnoreCase("suma")||operacion.equalsIgnoreCase("resta")||operacion.equalsIgnoreCase("multiplicacion")||operacion.equalsIgnoreCase("division")||operacion.equalsIgnoreCase("factorial")));
		entrada.close();
	}

	public static void areas() {
		
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la operacion que quiere realizar: Circulo, triangulo o rectangulo");
		String operacion;
		
		do {
			
			operacion = entrada.nextLine();
			operacion = operacion.toLowerCase();
			
			if(operacion.equalsIgnoreCase("circulo")||operacion.equalsIgnoreCase("triangulo")||operacion.equalsIgnoreCase("rectangulo")) {
				switch (operacion) {
				  case ("circulo"):
					  System.out.println(areaCirculo());
				  break;
				  case ("triangulo"):
					  System.out.println(areaTriangulo());
				  break;
				  case ("rectangulo"):
					 System.out.println(areaRectangulo());
				  break;
				  
				}
			}else {
				System.out.println("Introduzca una operacion correcta");
			}
			
		}while(!(operacion.equalsIgnoreCase("circulo")||operacion.equalsIgnoreCase("triangulo")||operacion.equalsIgnoreCase("rectangulo")));
		entrada.close();
	}
	
	public static void pasarABinario() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		double a = entrada.nextInt();
		String binario = "";
		String binarioOrdenado = "";
		do {
			if(a%2 == 0) {
				binario = binario + "0";
				a = (int)a/2;
			}else {
				binario = binario + "1";
				a = (int)a/2;
			}
		}while((int)a/2>=1);
		binario = binario + "1";
		
		for(int i=binario.length()-1; i>=0; i--) {
			binarioOrdenado = binarioOrdenado + binario.charAt(i);
		}
		System.out.println(binarioOrdenado); 
	}

	public static void numCifras() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int a = entrada.nextInt();
		String cadena = Integer.toString(a);
		int res = cadena.length();
		System.out.println(res);
	}

	public static double librasAEuros() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la cantidad");
		float a = entrada.nextInt();
		return a*0.86;
	}
	
	public static double dolarsAEuros() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la cantidad");
		int a = entrada.nextInt();
		return a*1.28611;
	}
	
	public static double yenesAEuros() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la cantidad");
		int a = entrada.nextInt();
		return a*129.852;
	}
	
	public static void cambioMoneda() {
		entrada = new Scanner(System.in);
		System.out.println("Introduzca la moneda que quiere cambiar: libras, dolars o yenes");
		String operacion;
		
		do {
			
			operacion = entrada.nextLine();
			operacion = operacion.toLowerCase();
			
			if(operacion.equalsIgnoreCase("libras")||operacion.equalsIgnoreCase("dolars")||operacion.equalsIgnoreCase("yenes")) {
				switch (operacion) {
				  case ("libras"):
					  System.out.println(librasAEuros());
				  break;
				  case ("dolars"):
					  System.out.println(dolarsAEuros());
				  break;
				  case ("yenes"):
					 System.out.println(yenesAEuros());
				  break;
				  
				}
			}else {
				System.out.println("Introduzca una moneda correcta");
			}
			
		}while(!(operacion.equalsIgnoreCase("libras")||operacion.equalsIgnoreCase("dolars")||operacion.equalsIgnoreCase("yenes")));
		entrada.close();
	}


	//----- Main -----

	public static void main(String[] args) {
		//operacionesBasicas();
		System.out.println(factorial());
		//operaciones();
		//System.out.println(esPrimo());
		//areas();
		//tabla();
		//pasarABinario();
		//numCifras();
		//cambioMoneda();
		

	}

}
