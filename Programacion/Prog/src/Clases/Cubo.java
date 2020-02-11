package Clases;

import javax.swing.JOptionPane;

public class Cubo {
	private int capacidad, contenido;

	public Cubo() {

	}

	public Cubo(int capacidad, int contenido) {
		this.capacidad = capacidad;
		if(contenido>capacidad) {
			JOptionPane.showMessageDialog(null, "La capacidad ha de ser mayor que el contenido");
		}
		this.contenido = contenido;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		if(contenido>capacidad) {
			JOptionPane.showMessageDialog(null, "La capacidad ha de ser mayor que el contenido");
		}
		this.contenido = contenido;
	}

	public void vuelcaEn(Cubo c) {
		if(c.getCapacidad()<contenido+c.contenido) {
			JOptionPane.showMessageDialog(null, "El cubo de destino no puede contener todo ese agua.");
		}else {
			c.contenido += contenido;
			contenido=0;
		}
	}

	public void vacia() {
		this.contenido = 0;
	}

	public void llena() {
		this.contenido = capacidad;
	}

	public String toString () {
		String cad = "";
		for(int i=capacidad-1; i>=0; i--) {
			if(i<contenido) {
				System.out.println("#~~~~#");
			}else {
				System.out.println("#    #");
			}
		}
		System.out.println("######");

		return cad;
	}
}
