package prueba;


public class Prueba3 {
	
	public static void euromillones() {
		int a, b;
		System.out.println("Su combinacion para el euromillones de esta semana sera:");
		for(int i=1;i<=5;i++) {
			a = (int) Math.floor(Math.random()*50+1);
			System.out.println(a + "");
		}
		System.out.println("Las estrellas seran:");
		for(int i=1; i<=2;i++) {
			b = (int) Math.floor(Math.random()*12+1);
			System.out.println(b + "");
		}
	}
	
	public static void primitiva() {
		int a;
		System.out.println("Su combinacion para la primitiva de esta semana sera:");
		for(int i=1;i<=6;i++) {
			a = (int) Math.floor(Math.random()*49+1);
			System.out.println(a + "");
		}
	}
	
	public static void euromillonesEscrito() {
		
	}
	
	
	public static void main(String[] args) {
		euromillones();
		System.out.println("\n");
		primitiva();
	}
}
