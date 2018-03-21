package com.ipartek.formacion.capitulo3;

public class EjercicioMesa {

	public static void main(String[] args) {
		System.out.println("Listado de Mesas");
		System.out.println("-----------");

		Mesa m1 = new Mesa(8, 6, "negro", 1);
		Mesa m2 = new Mesa(2, 5, "verde", 1);
		Mesa m3 = new Mesa(5, 7, "plateado", 2);
		Mesa m4 = new Mesa(3, 5, "amarillo", 3);
		Mesa m5 = new Mesa(1, 2, "custom", 4);
		Mesa m6 = new Mesa();

		System.out.println(m1);
		System.out.println("Precio = " + m1.getPrecio() + "€");
		System.out.println(m2);
		System.out.println("Precio = " + m2.getPrecio() + "€");
		System.out.println(m3);
		System.out.println("Precio = " + m3.getPrecio() + "€");
		System.out.println(m4);
		System.out.println("Precio = " + m4.getPrecio() + "€");
		System.out.println(m5);
		System.out.println("Precio = " + m5.getPrecio() + "€");
		System.out.println(m6);
		System.out.println("Precio = " + m6.getPrecio() + "€");

	}

}