package Clases;

public class Electrodomestico {
	private boolean encendido;
	private int potencia;
	
	public Electrodomestico(boolean encendido, int potencia) {
		this.encendido = false;
		this.potencia = potencia;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public int getPotencia() {
		if(encendido == false) {
			return 0;
		}
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void encender() {
		this.encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}
	
	public String toString() {
		String cad="";
		cad = "Encendido: " + this.encendido + "\n" + 
			  "Potencia: " + this.potencia;
		return cad;
	}
}
