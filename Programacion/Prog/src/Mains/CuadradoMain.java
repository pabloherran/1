package Mains;

import Clases.Cuadrado;
import Clases.Punto;

public class CuadradoMain {

	public static void main(String[] args) {
		Punto p1 = new Punto(1,0);
		Punto p2 = new Punto(1,5);
		Punto p3 = new Punto(6,5);
		Punto p4 = new Punto(6,0);
		
		Cuadrado c1 = new Cuadrado(p1,p2,p3,p4);
		
		Punto p5 = new Punto(1,0);
		Punto p6 = new Punto(1,5);
		Punto p7 = new Punto(6,5);
		Punto p8 = new Punto(6,0);
		
		Cuadrado c2 = new Cuadrado(p5,p6,p7,p8);
		
		/*c1.dibujar();
		System.out.println();
		c1.dibujarRelleno();*/
		
		//c1.dibujarPuntos();
		
		//System.out.println(c1.lado());
		//System.out.println(c1.area());
		
		c1.compara(c1, c2);
		
		
	}

}
