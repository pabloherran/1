package Clases;

public class Empleado {
	private String nombre, apellidos;
	private int edad, salario;
	private static int contEmp = 0;
	private boolean plusAplicado;
	
	public Empleado() {
		contEmp++;
	}
	
	public Empleado(String nombre, String apellidos, int edad, int salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
		this.plusAplicado = false;
		contEmp++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public boolean plus(int plus) {
		boolean bol = false;
		if(!isPlusAplicado()) {
			if(edad>40) {
				bol = true;
				salario = salario + 50;
			}
			setPlusAplicado(true);
		}
		return bol;
	}
	
	public String toString() {
		String cad = "NOMBRE: " + nombre + "\n" +
					 "APELLIDOS: " + apellidos + "\n" +
					 "EDAD: " + edad  + "\n" +
					 "SALARIO: " + salario + "\n";
		return cad;
	}

	public static int getContEmp() {
		return contEmp;
	}

	public static void setContEmp(int contEmp) {
		Empleado.contEmp = contEmp;
	}

	public boolean isPlusAplicado() {
		return plusAplicado;
	}

	public void setPlusAplicado(boolean plusAplicado) {
		this.plusAplicado = plusAplicado;
	}
}
