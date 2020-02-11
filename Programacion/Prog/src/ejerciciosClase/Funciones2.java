//PABLO HERRAN CASTRILLO - DA1D1E
package ejerciciosClase;

public class Funciones2 {

	
	//------------------------------ EJERCICIOS 1-11 ------------------------------
	
	public static long voltear(long num) {
		long numAux = 0;
		long resto;
		while(num>0) {
			resto=num%10;
			numAux = numAux*10+resto;
			num = num/10;
		}
		return numAux;
	}
	
	

	public static boolean esCapicua(long num) {
		if(num==voltear(num)) {
			return true;
		}
		return false;
	}
	
	
	
	public static long digitos(long num) {
		int cont=0;
		while(num>0) {
			num=num/10;
			cont++;
		}
		return cont;
	}
	
	
	
	public static long digitoN(long num, long numAux) {
		long resto=0;
		num=voltear(num);
		for(int i=1;i<=numAux;i++) {
			resto=num%10;
			num=num/10;
		}
		return resto;
	}
	
	
	
	public static long posicionDeDigito(long num, long digito) {
		long resto=0;
		num=voltear(num);
		long cont = 1;
		for(int i=1;i<=digitos(num);i++) {
			resto=num%10;
			if(resto==digito) {
				return cont;
			}else {
				num=num/10;
				cont++;
			}
		}
		return cont;
	}
	
	
	
	public static long quitaPorDetras(long num, long cifras) {
		long cifrasQuitadas = 0;
		do {
			num = num / 10;
			cifrasQuitadas ++;
		}while(cifrasQuitadas < cifras);
		
		return num;
	}
	
	
	
	public static long quitaPorDelante(long num, long cifras) {
		long cifrasQuitadas = 0;
		num=voltear(num);
		do {
			num = num / 10;
			cifrasQuitadas ++;
		}while(cifrasQuitadas < cifras);
		num=voltear(num);
		return num;
	}

	
	
	public static long pegaPorDetras(long num, long cifras) {
		long cifrasAñadidas = digitos(cifras);
		cifras=voltear(cifras);
		do {
			num = (num * 10) + cifras%10;
			cifras=cifras/10;
			cifrasAñadidas --;
		}while(cifrasAñadidas > 0);
		return num;
	}
	
	
	
	public static long pegaPorDelante(long num, long cifras) {
		long cifrasAñadidas = digitos(cifras);
		num=voltear(num);
		do {
			num = (num * 10) + cifras%10;
			cifras=cifras/10;
			cifrasAñadidas --;
		}while(cifrasAñadidas > 0);
		num=voltear(num);
		return num;
	}
	
	
	
	public static long trozoDeNumero(long ini, long fin) {
		/*
		 * Con esto controlamos la posibilidad de que el 
		 * usuario meta un numero mayor en el inicio que
		 * el numero que indica el la posicion final por 
		 * donde queremos cortar
		 */
		long aux=0;
		if(fin<ini) {
			aux=ini;
			ini=fin;
			fin=aux;
		}
		
		long num=123456789;
		long aux2=digitos(num);
		
		num=quitaPorDelante(num, ini-1);
		num=quitaPorDetras(num, aux2-fin);
		
		return num;
	}
	
	
	
	public static long juntaNumeros(long num1, long num2) {
		long cifrasAñadidas = digitos(num2);
		num2=voltear(num2);
		do {
			num1 = (num1 * 10) + num2%10;
			num2=num2/10;
			cifrasAñadidas --;
		}while(cifrasAñadidas > 0);
		return num1;
	}

	//------------------------------ MAIN ------------------------------

	public static void main(String[] args) {
		System.out.println("---------------- Ejercicio 1 ----------------");
		//System.out.println(voltear1(25));
		System.out.println();
		System.out.println("---------------- Ejercicio 2 ----------------");
		//System.out.println(esCapicua(12321));
		System.out.println();
		System.out.println("---------------- Ejercicio 3 ----------------");
		//System.out.println(digitos(12345));
		System.out.println();
		System.out.println("---------------- Ejercicio 4 ----------------");
		//System.out.println(digitoN(12497,3));
		System.out.println();
		System.out.println("---------------- Ejercicio 5 ----------------");
		//System.out.println(posicionDeDigito(152567, 2));
		System.out.println();
		System.out.println("---------------- Ejercicio 6 ----------------");
		//System.out.println(quitaPorDetras(123456,2));
		System.out.println();
		System.out.println("---------------- Ejercicio 7 ----------------");
		//System.out.println(quitaPorDelante(123456,2));
		System.out.println();
		System.out.println("---------------- Ejercicio 8 ----------------");
		//System.out.println(pegaPorDetras(1234,56));
		System.out.println();
		System.out.println("---------------- Ejercicio 9 ----------------");
		//System.out.println(pegaPorDelante(3456,12));
		System.out.println();
		System.out.println("---------------- Ejercicio 10 ----------------");
		//System.out.println(trozoDeNumero(7,4));
		System.out.println();
		System.out.println("---------------- Ejercicio 11 ----------------");
		//System.out.println(juntaNumeros(12,34));
		
	}

}