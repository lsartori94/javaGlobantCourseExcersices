package com.ejercicio.cuatro;

public class HerenciaYSobreescritura {

	public static void main(String[] args) {
		Clase1 a = new Clase1();

		a.m2();

		Clase1 b = new Clase2();

		b.m2();

		Clase2 c = new Clase3();

		c.m2();
		
	}

}
