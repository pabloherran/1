package Clases;

public class Fraccion {
	private int numerador, denominador;
	
	public Fraccion (){
		
	}
	
	public Fraccion (int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}

	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString() {
		String cad= "";
		if(denominador==1) {
			cad = numerador + "";
		}else {
			cad = numerador + "/" + denominador;
		}
		
		return cad;
	}
	
	public Fraccion suma(Fraccion p1, Fraccion p2) {
		Fraccion p3 = new Fraccion();
		if(p1.denominador == p2.denominador) {
			p3.numerador = p1.numerador + p2.numerador;
			p3.denominador = p1.denominador;
		}else {
			p3.numerador = (p1.numerador*p2.denominador) + (p2.numerador*p1.denominador);
			p3.denominador = p1.denominador*p2.denominador;
		}
		return p3;
	}
	
	public Fraccion resta(Fraccion p1, Fraccion p2) {
		Fraccion p3 = new Fraccion();
		if(p1.denominador == p2.denominador) {
			p3.numerador = p1.numerador - p2.numerador;
			p3.denominador = p1.denominador;
		}else {
			p3.numerador = (p1.numerador*p2.denominador) - (p2.numerador*p1.denominador);
			p3.denominador = p1.denominador*p2.denominador;
		}
		return p3;
	}
	
	public Fraccion division(Fraccion p1, Fraccion p2) {
		Fraccion p3 = new Fraccion();
		
		p3.numerador = p1.numerador*p2.denominador;
		p3.denominador = p1.denominador*p2.numerador;
		
		return p3;
	}
	
	public Fraccion multiplicacion(Fraccion p1, Fraccion p2) {
		Fraccion p3 = new Fraccion();
		
		p3.numerador = p1.numerador*p2.numerador;
		p3.denominador = p1.denominador*p2.denominador;
		
		return p3;
	}
	
	public Fraccion inversa(Fraccion p1) {
		Fraccion p3 = new Fraccion();
		
		p3.numerador = p1.denominador;
		p3.denominador = p1.numerador;
		
		return p3;
	}
	
	public Fraccion simplificar(Fraccion p1) {
		for(int i=2; i<=410; i++) {
			if(((p1.numerador%i)==0) && ((p1.denominador%i)==0)) {
				p1.numerador=p1.numerador/i;
				p1.denominador = p1.denominador/i;
			}
		}
		return p1;
	}
}
