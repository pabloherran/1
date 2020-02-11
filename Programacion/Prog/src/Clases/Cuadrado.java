package Clases;

import Clases.Punto;

public class Cuadrado {

	private Punto p1, p2, p3, p4;

	public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Punto getP3() {
		return p3;
	}

	public void setP3(Punto p3) {
		this.p3 = p3;
	}

	public Punto getP4() {
		return p4;
	}

	public void setP4(Punto p4) {
		this.p4 = p4;
	}

	public boolean esCuadrado () {
		if((p1.distancia(p2) == p2.distancia(p3)) && (p2.distancia(p3) == p3.distancia(p4)) && (p3.distancia(p4) == p4.distancia(p1)) && p4.distancia(p1)==p1.distancia(p2)) {
			return true;
		}else {
			return false;
		}
	}

	public String asteriscos(int x){
		String cad = "";
		for(int i=0; i<x; i++) {
			if(i==(x-1)) {
				cad += "*" + "\n";
			}else {
				cad += "* ";
			}
		}
		return cad;
	}

	public String blancos(int x) {
		String cad = "";
		for(int i=0; i<x; i++) {
			cad += "  ";
		}
		return cad;
	}


	public void dibujar() {
		if(esCuadrado() == false) {
			System.out.println("No es un cuadrado, asi que no se puede dibujar");
		}else {
			for(int i=1; i<=p3.getY()-p4.getY(); i++) {
				if(i==1 || i==p3.getY()-p4.getY()) {
					System.out.print(asteriscos(p3.getX()-p2.getX()));
				}else {
					System.out.print("* " + blancos(p3.getX()-p2.getX()-2) + "*" + "\n");
				}
			}
		}
	}


	public void dibujarRelleno() {
		if(esCuadrado() == false) {
			System.out.println("No es un cuadrado, asi que no se puede dibujar");
		}else {
			for(int j=1; j<=p3.getY()-p4.getY(); j++) {
				System.out.print(asteriscos(p3.getX()-p2.getX()));
			}
			System.out.println();
		}
	}

	public void dibujarPuntos() {
		if(esCuadrado() == false) {
			System.out.println("No es un cuadrado, asi que no se puede dibujar");
		}else {
			for(int i=0; i<(p3.getX()-p2.getX()); i++) {
				for(int j=0; j<p3.getY(); j++) {
					if(i==0 && j==0) {
						System.out.print(p2.toString() + "\t\t");
					}
					if(i==0 && j==(p2.getY()-1)) {
						System.out.print(p3.toString());
					}
					if(i==(p4.getX()-p2.getX()-1) && j==0) {
						System.out.print(p1.toString() + "\t\t");
					}
					if(i==(p3.getX()-p1.getX()-1) && j==(p3.getY()-p1.getY()-1)){
						System.out.print(p4.toString());
					}
				}
				for(int k=0; k<(p3.getX()-p1.getX()-1) && i==1; k++) {
					System.out.println();
				}
			}
		}
	}

	public int lado() {
		int i=p1.getX()-p3.getX();
		if(i<0) {
			i=-i;
		}
		return i;
	}

	public int area() {
		return (int) (p1.distancia(p2)*p2.distancia(p3));
	}

	public void compara(Cuadrado c1, Cuadrado c2) {
		if(c1.esCuadrado() == false || c2.esCuadrado()==false) {
			System.out.println("No es un cuadrado, asi que no se puede dibujar");
		}else {
			if(c1.area()>c1.area()) {
				System.out.println(1);
			}else if(c1.area()==c2.area()) {
				System.out.println(0);
			}else {
				System.out.println(-1);
			}
		}
	}

}

