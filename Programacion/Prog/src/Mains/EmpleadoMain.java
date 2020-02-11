package Mains;

import javax.swing.*;

import Clases.Cuenta;
import Clases.Empleado;

public class EmpleadoMain {

	public static void main(String[] args) {

		Empleado[] aEmp = new Empleado[5];

		boolean bool = true;
		int opcion, nEmp;
		int suma=0;

		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Se han creado " + Empleado.getContEmp() + " empleados." + "\n" + 
						"Seleccione una de las opciones: " + "\n" + 
						"1. Crear empleado" + "\n" + 
						"2. Mostrar empleado" + "\n" + 
						"3. Aplicar plus" + "\n" + 
						"4. Mostrar salario total" + "\n" + 
						"5. Salir" + "\n", "MENU", JOptionPane.QUESTION_MESSAGE
						));

				System.out.println();
			}while(opcion>5 || opcion <1);

			switch(opcion) {
			case 1: 
				if(Cuenta.getContadorCuentas()>=aEmp.length) {
					JOptionPane.showMessageDialog(null, "Se ha creado el maximo de cuentas disponibles, por favor elija otra opción.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}else {
					String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado " + (Empleado.getContEmp()+1));
					String apellidos = JOptionPane.showInputDialog("Introduce los apellidos del empleado " + (Empleado.getContEmp()+1));
					int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del empleado " + (Empleado.getContEmp()+1)));
					int salario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario del empleado " + (Empleado.getContEmp()+1)));

					aEmp[Empleado.getContEmp()] = new Empleado(nombre, apellidos, edad, salario);
				}
				break;

			case 2:
				do {
					String nCuentaS = JOptionPane.showInputDialog(null, "¿Que empleado desea consultar?", "OPCION", JOptionPane.DEFAULT_OPTION);
					nEmp = Integer.parseInt(nCuentaS);
				}while(nEmp>5 || nEmp<1);

				JOptionPane.showMessageDialog(null, aEmp[nEmp-1]);
				break;

			case 3:
				int plus = Integer.parseInt(JOptionPane.showInputDialog("Introduce el plus del empleado"));
				for(int i=0; i<Empleado.getContEmp();i++) {
					aEmp[i].plus(plus);
				}

				break;

			case 4:
				for(int i=0; i<Empleado.getContEmp();i++) {
					suma = suma + aEmp[i].getSalario();
				}
				JOptionPane.showMessageDialog(null, "La suma de todos los sueldos es: " + suma + "€", "MENU", JOptionPane.DEFAULT_OPTION);
				break;

			case 5:
				bool=false;
				JOptionPane.showMessageDialog(null,"Gracias por usar este servicio.");
				break;

			}

			int respuesta =  JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion? s/n", "OPCION", JOptionPane.YES_NO_OPTION);

			if(respuesta == JOptionPane.NO_OPTION) {
				bool=false;
				JOptionPane.showMessageDialog(null,"Gracias por usar este servicio.");
			}
		}while(opcion<=5 && bool);



		/*
		for(int i=0; i<aEmp.length; i++) {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado " + (i+1));
			String apellidos = JOptionPane.showInputDialog("Introduce los apellidos del empleado " + (i+1));
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del empleado " + (i+1)));
			int salario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario del empleado " + (i+1)));

			aEmp[i] = new Empleado(nombre, apellidos, edad, salario);
		}

		int contP = 0;
		int contNP = 0;
		for(int i=0; i<aEmp.length; i++) {
			if(aEmp[i].getEdad()>40) {
				aEmp[i].plus();
				contP++;
			}else {
				contNP++;
			}
		}

		int j=0;
		int k=0;
		Empleado[] aEmpP = new Empleado[contP];
		Empleado[] aEmpNP = new Empleado[contNP];
		for(int i=0; i<aEmp.length; i++) {
			if(aEmp[i].getEdad()>40) {
				aEmpP[j] = aEmp[i];
				j++;
			}else {
				aEmpNP[k] = aEmp[i];
			}
		}

		for(int i=0; i<aEmpP.length; i++) {
			JOptionPane.showMessageDialog(null, aEmpP[i]);
		}

		for(int i=0; i<aEmpNP.length; i++) {
			JOptionPane.showMessageDialog(null, aEmpNP[i]);
		}
	}
  */}
}
