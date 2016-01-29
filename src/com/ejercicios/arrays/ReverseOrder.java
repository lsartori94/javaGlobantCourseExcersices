package com.ejercicios.arrays;

import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {

		float[] a = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f };
		reverseOrder(a);
	}

	/*
	 * Prints the Array and reverses it
	 * 
	 * @param array
	 */
	private static void  reverseOrder(float[] array) {
		// Prints Original Array
		System.out.println("Original Array: "+Arrays.toString(array));
		
		if(array == null || array.length <= 1) {
			return;
		}
		
		for(int i = 0; i < array.length/2; i++) {
			float tmp = array[i];
			int pos = array.length - 1 - i;
			// Switch the elements
			array[i] = array[pos];
			array[pos] = tmp;
		}
		// Prints the reversed array
		System.out.println("Rerversed Array: "+Arrays.toString(array));
	}
}
