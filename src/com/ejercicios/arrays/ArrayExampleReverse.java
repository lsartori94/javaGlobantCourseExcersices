package com.ejercicios.arrays;

//import java.util.Arrays;

public class ArrayExampleReverse {

	public static void main(String[] args) {
		int [] a = new int[10];
		for (int i = 0; i < 10; i++)
		   		a[i] = 9 - i;
//		System.out.println(Arrays.toString(a));
		for (int i = 0; i < 10; i++)
		   		a[i] = a[a[i]];
//		System.out.println(Arrays.toString(a));
		for (int i = 0; i < 10; i++)
		   		System.out.println(a[i]);
	}
}
