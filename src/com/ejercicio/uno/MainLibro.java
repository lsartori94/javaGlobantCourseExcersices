package com.ejercicio.uno;

public class MainLibro {

	public static void main(String[] args) {
		String title = "El Psicoanalista";
		String autor = "John Algo";
		int a�o = 2000;
		String editorial = "Alfaguara";		
		
		String title2 = "Hunger Games";
		String autor2 = "No se la verdad";
		int a�o2 = 2005;
		String editorial2 = "Penguin";

		Libro lib = new Libro(title, autor, a�o, editorial);
		Libro lib2 = new Libro(title2, autor2, a�o2, editorial2);
		
		System.out.println("Libro 1");
		System.out.println(lib.getInfo());
		System.out.println("");
		System.out.println("Libro 2");
		System.out.println(lib2.getInfo());
	}

}
