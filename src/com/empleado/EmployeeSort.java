package com.empleado;

import java.util.LinkedList;
import java.util.List;


public class EmployeeSort {

	public static void main(String[] args) {
		List<Empleado> lEmp = new LinkedList<Empleado>();
		lEmp.add(new Empleado("Fede", 2000));
		lEmp.add(new Empleado("Luca", 50000));
		lEmp.add(new Empleado("Nico", 100));
		
		lEmp.sort(new EmpleadoComparator());
		
		for (Empleado empleado : lEmp) {
			System.out.println(empleado.toString());
		}
	}

}
