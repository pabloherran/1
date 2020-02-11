package Clases;

import javax.swing.*;

public class Cafetera {
	
	private int capMax, capAct;
	
	public Cafetera() {
		capMax = 1000;
		capAct = 0;
	}
	
	public Cafetera(int capMax) {		
		this.capAct = capMax;
		this.capMax = capMax;
	}
	
	public Cafetera(int capMax, int capAct) {		
		if(capAct>capMax) {
			capAct=capMax;
		}
		this.capMax = capMax;
	}

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	public int getCapAct() {
		return capAct;
	}

	public void setCapAct(int capAct) {
		this.capAct = capAct;
	}
	
	public void llenar() {
		this.capAct = capMax;
	}
	
	public void servirTaza(int taza) {
		if(taza<capAct) {
			capAct = capAct - taza;
			JOptionPane.showMessageDialog(null, "Se ha servido una taza y la capacidad actual de la cafetera es " + capAct + "cc");
		}else {
			capAct=0;
		}
	}
	
	public void agregarCafe(int cantidad) {
		this.capAct = cantidad;
	}
}
