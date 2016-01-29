package com.ejercicios.arrays;

public class TwoDimBolArray {

	public static void main(String[] args) {
		
		boolean[][] bolArray = new boolean[][]{
			{true, false, true, false},
			{false, true, false, true},
			{true, false, true, false},
			{false, true, false, true}
		};
		
		printArray(bolArray);
	}	
	
	private static void printArray(boolean[][] bol) {
		int fila = 0;
		int columna = 0;
		for (boolean[] b : bol) {
			fila++;
			for (columna = 0; columna < b.length; columna++) {
				boolean c = b[columna];
				if (c) {
					System.out.println("Elemento ["+fila+"]["+columna+"]= *");
				}
				else {
					System.out.println("Elemento ["+fila+"]["+columna+"]=  ");
				}
			}
		}
	}
}
