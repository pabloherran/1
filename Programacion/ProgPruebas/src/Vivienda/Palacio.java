package Vivienda;

public class Palacio extends Vivienda{

	protected int nHabitaciones;
	
	public Palacio(int mC, String c, int n, int nHabitaciones) {
		super(mC,c, n);
		this.nHabitaciones = nHabitaciones;
	}

	public String toString() {
		String cad = super.toString();
		cad += "\nNUMERO DE HABITACIONES: " + nHabitaciones;
		return cad;
	}

	public int getnHabitaciones() {
		return nHabitaciones;
	}

	public void setnHabitaciones(int nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}
}
