package Vivienda;

import java.util.*;

import javax.swing.JOptionPane;

public class Viviendas {

	ArrayList<Vivienda> viviendas;


	public Viviendas() {
		viviendas = new ArrayList<Vivienda>();
	}

	public void añadirVivienda(Vivienda v) {
		viviendas.add(v);
	}

	public void EliminarVivienda(String c, int n) {
		for(int i=0; i<viviendas.size(); i++){
			if(viviendas.get(i).getCalle().equals(c) && viviendas.get(i).getNumero()==n) {
				viviendas.remove(i);
			}
		}
	}
	
	public void mostrarVivienda() {
		for(int i=0; i<viviendas.size(); i++) {
			if(viviendas.get(i) instanceof Vivienda) {
				JOptionPane.showMessageDialog(null, viviendas.get(i).toString());
			}else if(viviendas.get(i) instanceof Chalet) {
				JOptionPane.showMessageDialog(null, viviendas.get(i).toString());
			}else if(viviendas.get(i) instanceof Palacio) {
				JOptionPane.showMessageDialog(null, viviendas.get(i).toString());
			}
		}
	}
	
	public void mostrarPalacio() {
		for(int i=0; i<viviendas.size(); i++) {
			if(viviendas.get(i) instanceof Palacio) {
				JOptionPane.showMessageDialog(null, viviendas.get(i).toString());
			}
		}
	}

}
