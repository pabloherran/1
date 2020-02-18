package Vivienda;

import javax.swing.JOptionPane;

public class ViviendaMain {

	public static void main(String[] args) {
		
		boolean bool = true;
		int mC, num, numH, opcion;
		String calle;
		Vivienda v1;
		Viviendas vs1 = new Viviendas();
		boolean jardin = false;
		
		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUZCA LA OPCION" + "\n" + "\n" + 
						"1. Insertar vivienda" + "\n" + 
						"2. Insertar chalet" + "\n" + 
						"3. Insertar palacio" + "\n" + 
						"4. Mostrar viviendas" + "\n" + 
						"5. Mostrar palacios" + "\n" +
						"6. Borrar vivienda" + "\n" +
						"7. Salir" + "\n", "MENU", JOptionPane.QUESTION_MESSAGE
				));
			}while(opcion<1 || opcion>7);
			
			switch(opcion) {
			case 1: 
				mC = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca los metros cuadrados de la vivienda"));
				calle = JOptionPane.showInputDialog(null, "Introduzca la calle");
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de la vivienda"));
				
				v1 = new Vivienda(mC, calle, num);
				vs1.añadirVivienda(v1);
				break;
				
			case 2:
				calle = JOptionPane.showInputDialog(null, "Introduzca la calle");
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de la vivienda"));
				String jardins = JOptionPane.showInputDialog(null, "¿Tiene jardin el chalet?");
				if(jardins.equals("si")) {
					jardin=true;
				}else {
					jardin=false;
				}
				
				v1 = new Chalet(calle, num, jardin);
				vs1.añadirVivienda(v1);
				break;
				
			case 3: 
				mC = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca los metros cuadrados de la vivienda"));
				calle = JOptionPane.showInputDialog(null, "Introduzca la calle");
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de la vivienda"));
				numH = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantas habitaciones tiene el palacio?"));
				
				v1 = new Palacio(mC, calle, num, numH);
				vs1.añadirVivienda(v1);
				break;
				
			case 4: 
				vs1.mostrarVivienda();
				break;
				
			case 5:
				vs1.mostrarPalacio();
				break;
				
			case 6:
				JOptionPane.showMessageDialog(null, "Introduzca los datos de la vivienda que quiere borrar");
				calle = JOptionPane.showInputDialog(null, "Introduzca la calle");
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de la vivienda"));
				
				vs1.EliminarVivienda(calle, num);
				break;
				
			case 7:
				bool=false;
				JOptionPane.showMessageDialog(null,"Gracias por usar este servicio.");
				break;
			}
		}while(opcion<=7 && bool);
		
		
	}

}
