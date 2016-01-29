package com.empleado;

public class Empleado implements Comparable<Empleado> {
	private int salary;
	private String name;
	
	public Empleado(String name, int salary) {
		setSalary(salary);
		setName(name);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Empleado arg0) {
		if (this.salary < arg0.salary) {
			return 1;
		}
		else if (this.salary > arg0.salary) {
			return -1;
		}
		else
			return 0;
	}
	
	public String toString() {
		return "Nombre de Empleado: "+this.name+"  Salario: "+this.salary;
	}
	
}
