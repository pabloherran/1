package ejerciciosClase;

import javax.swing.*;

public class Dialogo1 {
	
	public Dialogo1() {
		String respuesta = JOptionPane.showInputDialog(null, "Nombre ", "Tutorial de java, Swing", JOptionPane.DEFAULT_OPTION);
		
		System.out.println("Respuesta: " + respuesta);
	}

}
