package Vivienda;

public class Vivienda {
	
	protected int metrosCuadrados, numero;
	protected String calle;
	
	public Vivienda() {
		this.metrosCuadrados=0;
		this.calle="";
		this.numero=0;
	}
	
	public Vivienda(int metrosCuadrados, String calle, int numero) {
		this.metrosCuadrados = metrosCuadrados;
		this.calle = calle;
		this.numero = numero;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String toString() {
		String cad="";
		cad = "METROS CUADRADOS: " + metrosCuadrados + "m2"+  
			  "\nCALLE: "  + calle + 
			  "\nNUMERO: " + numero;
		return cad;
	}
}
