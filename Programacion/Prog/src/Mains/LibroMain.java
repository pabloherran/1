package Mains;

import Clases.Libro;

public class LibroMain {

	public static void main(String[] args) {

		Libro l1 = new Libro("El mar de los sueños", "Antonio Martin Morales", 2, 1);
		Libro l2 = new Libro("Las luces de septiembre", "Carlos Ruiz Zafon", 5, 0);
		Libro l3 = new Libro();
		
		
		System.out.println("-----Libro 1-----");
		l1.devolucion();
		System.out.println(l1.getTitulo());
		System.out.println(l1.toString());
		System.out.println();
		
		
		System.out.println("-----Libro 2-----");
		System.out.println(l2.toString());
		l2.devolucion();
		System.out.println(l2.toString());
		l2.prestamo();
		System.out.println(l2.getTitulo());
		System.out.println(l2.toString());
		System.out.println();
		
		
		System.out.println("-----Libro 3-----");
		System.out.println(l3.toString());
		l3.setAutor("Pablo Herran Castrillo");
		System.out.println(l3.getAutor());
		l3.setNumEjem(10);
		l3.setNumEjemPrest(5);
		l3.setTitulo("Mi vida");
		System.out.println(l3.toString());
		
	}

}
