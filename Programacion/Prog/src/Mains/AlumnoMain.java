package Mains;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Clases.Alumno;

public class AlumnoMain {

	public static void main(String[] args) {

		ArrayList<Alumno> aAlum = new ArrayList<Alumno>();

		boolean bool = true;
		int opcion;
		Alumno a;
		String nombre, apellido;
		int curso = 0;
		double nota = 0.0;

		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Se han dado de alta " + aAlum.size() + " alumnos." + "\n" + "\n" +
						"Seleccione una de las opciones: " + "\n" + 
						"1. Dar de alta un alumno" + "\n" + 
						"2. Mostrar alumnos aprobados" + "\n" + 
						"3. Mostrar alumnos suspensos" + "\n" + 
						"4. Salir" + "\n", "MENU", JOptionPane.QUESTION_MESSAGE
						));

				System.out.println();
			}while(opcion>4 || opcion <1);

			switch(opcion) {
			case 1: 
				nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno " + (aAlum.size() +1));
				apellido = JOptionPane.showInputDialog("Introduce el apellido del alumno " + (aAlum.size() +1));
				curso = Integer.parseInt(JOptionPane.showInputDialog("Introduce el curso del alumno " + (aAlum.size() +1)));
				nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del alumno " + (aAlum.size() +1)));

				a = new Alumno(nombre, apellido, curso, nota);
				aAlum.add(a);
			break;

		case 2:
			int cont =0 ;
			for(int i=0; i<aAlum.size(); i++) {
				if(aAlum.get(i).getNota()>=5) {
					cont++;
					JOptionPane.showMessageDialog(null, aAlum.get(i));
				}
			}
			JOptionPane.showMessageDialog(null, "Han aprobado " + cont + " alumnos");
			break;

		case 3:
			int cont2 =0 ;
			for(int i=0; i<aAlum.size(); i++) {
				if(aAlum.get(i).getNota()<5) {
					cont2++;
					JOptionPane.showMessageDialog(null, aAlum.get(i));
				}
			}
			JOptionPane.showMessageDialog(null, "Han aprobado " + cont2 + " alumnos");
			break;

		case 4:
			bool=false;
			JOptionPane.showMessageDialog(null,"Gracias por usar este servicio.");
			break;
		}

		int respuesta =  JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion? s/n", "OPCION", JOptionPane.YES_NO_OPTION);

		if(respuesta == JOptionPane.NO_OPTION) {
			bool=false;
			JOptionPane.showMessageDialog(null,"Gracias por usar este servicio.");
		}

	}while(opcion<=4 && bool);
}
}
