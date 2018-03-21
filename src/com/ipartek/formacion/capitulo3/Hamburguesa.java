//1.Definición package
package com.ipartek.formacion.capitulo3;

import java.util.Scanner;

//3. Definición de la clase
public class Hamburguesa {

	// Precio en €
	public static final float PRECIO_PAN = (float) 0.30;
	public static final float PRECIO_CARNE = (float) 0.70;
	public static final float PRECIO_TOMATE = (float) 0.50;
	public static final float PRECIO_LECHUGA = (float) 0.25;
	public static final float PRECIO_PEPINO = (float) 0.30;
	public static final float PRECIO_QUESO = (float) 0.70;

	public static final float[] INGREDIENTES_PRECIO = { PRECIO_PAN, PRECIO_CARNE, PRECIO_TOMATE, PRECIO_LECHUGA,
			PRECIO_PEPINO, PRECIO_QUESO };

	// 4. Atributos. Siempre van a ser private
	private String[] ingredientes;

	public Hamburguesa(String[] ingredientes) {
		super();
		this.ingredientes = ingredientes;
	}

	private float[] ingredientesPrecio;

	/*
	 * 5. Métodos 5.1 Constructores 5.2 Getters & Setters 5.3 Otros métodos
	 */

	public Hamburguesa() {
		super();
		this.ingredientes = new String[] { "pan", "carne", " ", " ", " ", " " };

	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public float[] getIngredientesPrecio() {
		return ingredientesPrecio;
	}

	public void setIngredientesPrecio(float[] ingredientesPrecio) {
		this.ingredientesPrecio = ingredientesPrecio;
	}

	public static float getPrecioPan() {
		return PRECIO_PAN;
	}

	public static float getPrecioCarne() {
		return PRECIO_CARNE;
	}

	public static float getPrecioTomate() {
		return PRECIO_TOMATE;
	}

	public static float getPrecioLechuga() {
		return PRECIO_LECHUGA;
	}

	public static float getPrecioPepino() {
		return PRECIO_PEPINO;
	}

	public static float getPrecioQueso() {
		return PRECIO_QUESO;
	}

	public float getPrecioHamburguesa() {
		float resultado = (float) 0.0;
		float precioHamburguesa = (float) 0.0;
		resultado = resultado + PRECIO_PAN + PRECIO_CARNE;

		if (ingredientes[2] != " ") {
			resultado = resultado + INGREDIENTES_PRECIO[2];
		}

		if (ingredientes[3] != " ") {
			resultado = resultado + INGREDIENTES_PRECIO[3];
		}

		if (ingredientes[4] != " ") {
			resultado = resultado + INGREDIENTES_PRECIO[4];
		}

		if (ingredientes[5] != " ") {
			resultado = resultado + INGREDIENTES_PRECIO[5];
		}

		precioHamburguesa = resultado;
		return precioHamburguesa;
	}

	public static void main(String[] args) {

		Hamburguesa h1 = new Hamburguesa();
		System.out.println(h1);
		System.out.println("PRECIO: " + h1.getPrecioHamburguesa() + "€");

		String[] ingredientesh2 = { "pan", "carne", " ", "lechuga", " ", "queso" };
		Hamburguesa h2 = new Hamburguesa(ingredientesh2);
		System.out.println(h2);
		System.out.println("PRECIO: " + h2.getPrecioHamburguesa() + "€");

		System.out.println("Creacion de Hamburguesas");
		System.out.println("--------------------------");

		pedirDatos();

		imprimirTicket();

	}

	private static void pedirDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿ Con tomate ?");
		String tomate = sc.next();

		System.out.println("¿ Con lechuga ?");
		String lechuga = sc.next();

	}

	private static void imprimirTicket() {
		System.out.println("----------------------------");
		System.out.println("----RESUMEN-----------------");
		System.out.println("----------------------------");
		System.out.println("Con tomate: " + "   0.5€ ");
		System.out.println("con lechuga: " + "      0.25€ ");
		System.out.println("----------------------------");
		System.out.println("Precio                   1.75€");
		System.out.println("----------------------------");

	}

}
