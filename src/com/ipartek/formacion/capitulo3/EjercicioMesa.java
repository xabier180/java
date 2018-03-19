package com.ipartek.formacion.capitulo3;

public class EjercicioMesa {

	public static void main(String[] args) {
		System.out.println("Listado de Mesas");
		System.out.println("-----------");

		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa(1);
		Mesa m3 = new Mesa(-3);

		m1.setNumeroPatas(8);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

	}

}