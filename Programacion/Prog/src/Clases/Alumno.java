package Clases;

public class Alumno {
	
	private String nombre, apellido;
	private int curso;
	private double nota;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellido, int curso, double nota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String toString() {
		String cad = "";
		cad = "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Curso: " + curso + "\n" + "Nombre: " + nota + "\n";
		return cad;
	}
	
}
