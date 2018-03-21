package com.ipartek.formacion.capitulo2;

import java.util.Scanner;

import com.ipartek.formacion.capitulo3.Mesa;

public class HelloWorld {

	static int patas;
	static String color;

	public static void ejemplo(String[] args) {
		String saludo = "Hola Mundo";
		System.out.println(saludo);

		Mesa m1 = new Mesa(Mesa.MATERIAL_ALUMINIO, 2);
		System.out.println(m1.toString());
	}

	public static void main(String[] args) {

		System.out.println("Configurador de Mesas");
		System.out.println("--------------------------");

		pedirDatos();

		imprimirTicket();

	}

	private static void pedirDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿ Número de patas ?");
		int patas = sc.nextInt();

		System.out.println("¿ Color ?");
		String color = sc.next();

	}

	private static void imprimirTicket() {
		System.out.println("----------------------------");
		System.out.println("----RESUMEN-----------------");
		System.out.println("----------------------------");
		System.out.println("Nº patas: " + patas + "   2€ ");
		System.out.println("color: " + color + "      0€ ");
		System.out.println("----------------------------");
		System.out.println("Precio                   12€");
		System.out.println("----------------------------");

	}

}
