package Clases;

import javax.swing.*;

public class Promedio {
	private int [] ANum;
	private static int cont=0;
	private int dimension;

	public Promedio(int dimension) {
		this.dimension=dimension;
		ANum = new int[dimension];
	}

	public void agregarNum() {
		if(cont == dimension) {
			JOptionPane.showMessageDialog(null, "Este es el ultimo numero que puede agregar.");
			ANum[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero"));
			cont++;
		}
		ANum[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero"));
		cont++;

	}

	public int contador() {
		int contador=0;
		for(int i=0; i<ANum.length; i++) {
			if(ANum[i]!=0)
				contador++;
		}
		return contador;
	}

	public double obtenerPromedio() {
		double res=0;
		for(int i=0; i<cont; i++) {
			res = res + ANum[i];
		}
		res = res/cont;
		return res;
	}

	public String toString() {
		String res = "";
		for(int i=0; i<ANum.length; i++) {
			if(ANum[i]!=0) {
				res += ANum[i] + " " ;
			}else {
				res += "";
			}
			
		}
		return res;
	}
}
