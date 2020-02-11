package Mains;

import javax.swing.*;
import Clases.Promedio;

public class PromedioMain {

	public static void main(String[] args) {
		int dimension;
		
		do {
			dimension = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el maximo de elementos"));
			if(dimension==0) {
				JOptionPane.showMessageDialog(null, "Por favor introduzca un valor valido.");
			}
		}while(dimension<=0);
		
		

		int opcion;
		boolean bool = true;
		Promedio p1 = new Promedio(dimension);
		
		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Seleccione una de las opciones: " + "\n" + 
						"1. Agregar numero" + "\n" + 
						"2. Mostrar todos los numeros añadidos" + "\n" + 
						"3. Mostrar promedio" + "\n" + 
						"4. Salir" + "\n", "MENU", JOptionPane.QUESTION_MESSAGE
						));
				
				System.out.println();
			}while(opcion>5 || opcion <1);
			
			
			switch(opcion) {
			case 1: 
				if(dimension==0) {
					JOptionPane.showMessageDialog(null, "No se pueden añadir numeros porque el maximo ha sido 0");
				}
				p1.agregarNum();
				break;

			case 2:
				if(p1.contador()==0) {
					JOptionPane.showMessageDialog(null, "No se han ingresado numeros. Por favor seleccione una opcion valida.");
				}else {
					JOptionPane.showMessageDialog(null, p1.toString());
				}
				break;

			case 3:
				if(p1.contador()==0) {
					JOptionPane.showMessageDialog(null, "No se han ingresado numeros. Por favor seleccione una opcion valida.");
				}else {
					JOptionPane.showMessageDialog(null, p1.obtenerPromedio());
				}
				break;

			case 4:
				bool=false;
				JOptionPane.showMessageDialog(null,"Gracias por usar este servicio.");
				break;
			}			
		}while(opcion<=5 && bool);
	}

}
