package prueba;

import java.util.Random;

public class Prueba4 {
	
	public static void creaRandom() {
		Random r1 = new Random(5000);
		Random r2 = new Random(5000);
		
		int n1, n2, n3;
		n1 = r1.nextInt();
		n2 = r2.nextInt();
		n3 = (int) (Math.random()*10+5);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
	
	
	
	public static void main(String [] args) {
		
		creaRandom();
		
		
		/*
		if(args[2].equals("+")) {
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		}else if(args[2].equals("-")) {
			System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
		}else if(args[2].equals("*")) {
			System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
		}else if(args[2].equals("/")){
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
		}*/
	}
}