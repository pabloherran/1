package Mains;

import Clases.Cubo;

public class CuboMain {

	public static void main(String[] args) {
		
		System.out.println("Cubo grande");
		Cubo c1 = new Cubo(6,4);
		//c1.setContenido(9);
		c1.llena();
		c1.vacia();
		c1.toString();
		
		/*System.out.println("Cubo pequeño");
		Cubo c2 = new Cubo(2,2);
		//c1.setContenido(9);
		c2.toString();
		
		System.out.println();
		c2.vuelcaEn(c1);
		c1.toString();
		
		c1.vuelcaEn(c2);
		c2.toString();
*/
	}

}
