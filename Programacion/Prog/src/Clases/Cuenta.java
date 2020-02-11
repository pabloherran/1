package Clases;

public class Cuenta {
	private int cantidadInicial, numCuenta;
	private static int contadorCuentas;
	String nombre, DNI;

	
	public Cuenta() {
		this.numCuenta = contadorCuentas;
		contadorCuentas++;
	}
	
	public Cuenta(int cantidadInicial, String nombre, String DNI) {
		this.cantidadInicial = cantidadInicial;
		this.nombre = nombre;
		this.DNI = DNI;
		this.numCuenta = contadorCuentas;
		contadorCuentas++;
	}

	public int getCantidadInicial() {
		return cantidadInicial;
	}

	public void setCantidadInicial(int cantidadInicial) {
		this.cantidadInicial = cantidadInicial;
	}
	
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public static int getContadorCuentas() {
		return contadorCuentas;
	}

	public static void setContadorCuentas(int contadorCuentas) {
		Cuenta.contadorCuentas = contadorCuentas;
	}
	
	public void ingresar(int ingresar) {
		cantidadInicial = cantidadInicial + ingresar;
	}
	
	public void retirar(int retirar) {
		if(cantidadInicial>retirar) {
			cantidadInicial = cantidadInicial - retirar;
		}else {
			System.out.println("No hay suficiente saldo para retirar esa cantidad");
		}
		
	}
	
	public String toString() {
		String cad = "El saldo de la cuenta  " + (numCuenta + 1) + " es: " + cantidadInicial + "€" + "\n" + 
					 "La cuenta pertenece a :" + nombre + "\n" + 
					 "Su DNI es: " + DNI;
		return cad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	
	
}
