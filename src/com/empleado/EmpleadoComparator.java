package com.empleado;

import java.util.Comparator;

public class EmpleadoComparator implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.compareTo(o2);
	}

}
