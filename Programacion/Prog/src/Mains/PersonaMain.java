package Mains;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Clases.Cuenta;


public class PersonaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cuenta[]aCuenta = new Cuenta[5];

		int cantidad = 0;
		int nCuenta = 0;
		int opcion ;
		boolean bool = true;


		do {
			do {
				String opcionS = JOptionPane.showInputDialog(null, "Se han creado " + Cuenta.getContadorCuentas() + " cuentas." + "\n" + 
						"Seleccione una de las opciones: " + "\n" + 
						"1. Crear cuenta" + "\n" + 
						"2. Sacar dinero" + "\n" + 
						"3. Ingresar dinero" + "\n" + 
						"4. Mostrar cuenta" + "\n" + 
						"5. Mostrar todas las cuentas" + "\n", "Menu", JOptionPane.QUESTION_MESSAGE
						);
				
				opcion = Integer.parseInt(opcionS);
				System.out.println();
			}while(opcion>5 || opcion <1);

			switch(opcion) {
			case 1: 
				if(Cuenta.getContadorCuentas()>=aCuenta.length) {
					JOptionPane.showMessageDialog(null, "Se ha creado el maximo de cuentas disponibles, por favor elija otra opción.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}else {
					String nombre = JOptionPane.showInputDialog(null, "Introduzca su nombre");
					String DNI = JOptionPane.showInputDialog(null, "Introduzca su DNI");
					String cantidadS = JOptionPane.showInputDialog(null, "¿Qué cantidad desea ingresar como cantidad inicial?");
					cantidad = Integer.parseInt(cantidadS);

					aCuenta[Cuenta.getContadorCuentas()] = new Cuenta(cantidad, nombre, DNI);
				}
				break;
			case 2:
				do {
					String nCuentaS = JOptionPane.showInputDialog(null, "¿De que cuenta desea sacar dinero?", "OPCION", JOptionPane.DEFAULT_OPTION);
					nCuenta = Integer.parseInt(nCuentaS);
				}while(nCuenta>5 || nCuenta<1);
				
				String cantidadS2 = JOptionPane.showInputDialog(null,"¿Qué cantidad desea retirar?", "OPCION", JOptionPane.DEFAULT_OPTION);
				cantidad = Integer.parseInt(cantidadS2);
				
				aCuenta[nCuenta-1].retirar(cantidad);
				
				break;
			case 3:
				do {
					String nCuentaS = JOptionPane.showInputDialog(null, "¿En que cuenta desea ingresar dinero?", "OPCION", JOptionPane.DEFAULT_OPTION);
					nCuenta = Integer.parseInt(nCuentaS);
				}while(nCuenta>5 || nCuenta<1);

				String cantidadS3 = JOptionPane.showInputDialog(null, "¿Qué cantidad desea ingresar?", "OPCION", JOptionPane.DEFAULT_OPTION);
				cantidad = Integer.parseInt(cantidadS3);

				aCuenta[nCuenta-1].ingresar(cantidad);
				
				break;
			case 4:
				do {
					String nCuentaS = JOptionPane.showInputDialog(null, "¿Que cuenta desea consultar?", "OPCION", JOptionPane.DEFAULT_OPTION);
					nCuenta = Integer.parseInt(nCuentaS);
				}while(nCuenta>5 || nCuenta<1);

				JOptionPane.showMessageDialog(null, aCuenta[nCuenta-1]);
				break;
			case 5:
				for(int i=0; i<=Cuenta.getContadorCuentas()-1; i++) {
					JOptionPane.showMessageDialog(null, aCuenta[i], "CUENTAS", JOptionPane.INFORMATION_MESSAGE);
				}
				break;

			}

			int respuesta =  JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion? s/n", "OPCION", JOptionPane.YES_NO_OPTION);
			
			
			if(respuesta == JOptionPane.NO_OPTION) {
				bool=false;
				JOptionPane.showMessageDialog(null,"Gracias por usar este servicio.");
			}

		}while(opcion<=5 && bool);
		sc.close();
	}
}
