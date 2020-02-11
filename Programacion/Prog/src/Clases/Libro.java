package Clases;

public class Libro {
	
	private String titulo, autor;
	private int numEjem, numEjemPrest;
	private static int contadorLibros = 0;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int numEjem, int numEjemPrest) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjem = numEjem;
		this.numEjemPrest = numEjemPrest;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjem() {
		return numEjem;
	}

	public void setNumEjem(int numEjem) {
		this.numEjem = numEjem;
	}

	public int getNumEjemPrest() {
		return numEjemPrest;
	}

	public void setNumEjemPrest(int numEjemPrest) {
		this.numEjemPrest = numEjemPrest;
	}
	
	public boolean prestamo() {
		if(numEjem == 0) {
			System.out.println("No hay ejemplares disponibles");
		}else {
			numEjem--;
			numEjemPrest++;
		}
		return true;
	}
	
	public boolean devolucion() {
		if(numEjemPrest==0) {
			System.out.println("Ese libro no ha sido prestado");
			return false;
		}
		else {
			numEjem++;
			numEjemPrest--;
		}
		return true;
	}
	
	public String toString() {
		String cad = "El titulo es: " + titulo + "\n" +
					 "El autor es: " + autor + "\n" + 
				     "El numero de ejemplares es: " + numEjem + "\n" +
					 "El numero de ejemplares prestados es: " + numEjemPrest + "\n";
		return cad;
	}

	public static int getContadorLibros() {
		return contadorLibros;
	}

	public static void setContadorLibros(int contadorLibros) {
		Libro.contadorLibros = contadorLibros;
	}
	
}
