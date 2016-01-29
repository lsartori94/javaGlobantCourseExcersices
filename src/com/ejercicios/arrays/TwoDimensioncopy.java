package com.ejercicios.arrays;

import java.util.Arrays;

public class TwoDimensioncopy {

	public static void main(String[] args) {
		// Square array
		int [][] a = {
				{1,2},
				{3,4}
		};
		
		// Rectangular array
		int [][] a2 = {
				{1,2,3},
				{4,5,6}
		};
		
		// Ragged array
		int [][] a3 = {
				{1,2},
				{3},
				{4,5,6}
		};

		// Copies
		int[][] b = copy(a);
		int[][] b2 = copy(a2);
		int[][] b3 = copy(a3);
		
		// Print
		System.out.println("Original: ");
		for (int[] fila : a) {
			System.out.println(Arrays.toString(fila));
		}
		System.out.println(" ");
		
		System.out.println("Copy: ");
		for (int[] fila : b) {
			System.out.println(Arrays.toString(fila));
		}
		System.out.println(" ");
		
		System.out.println("Original: ");
		for (int[] fila : a2) {
			System.out.println(Arrays.toString(fila));
		}
		System.out.println(" ");
		
		System.out.println("Copy: ");
		for (int[] fila : b2) {
			System.out.println(Arrays.toString(fila));
		}
		System.out.println(" ");
		
		System.out.println("Original: ");
		for (int[] fila : a3) {
			System.out.println(Arrays.toString(fila));
		}
		System.out.println(" ");
		
		System.out.println("Copy: ");
		for (int[] fila : b3) {
			System.out.println(Arrays.toString(fila));
		}
		
	}
	
	private static int[][] copy(int[][] in) {
		int fila = 0;
		int[][] out = new int[in.length][];
		
		for (int[] filas : in) {
			out[fila] = new int[filas.length];
			fila++;
		}
		
		for (int indexFil = 0; indexFil < in.length; indexFil++) {
			for (int indexCol = 0; indexCol < in[indexFil].length; indexCol++) {
				out[indexFil][indexCol] = in[indexFil][indexCol];
			}
		}

		return out;
	}
	
}
