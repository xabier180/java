//1.Definición package
package com.ipartek.formacion.capitulo3;

//2. Imports => Ahora mismo no tenemos ninguno

//3. Definición de la clase
public class Mesa {

	// Precio en €
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;

	// 4. Atributos. Siempre van a ser private
	private int numeroPatas;
	private int dimension;
	private String color;
	private int material;

	/*
	 * 5. Métodos 5.1 Constructores 5.2 Getters & Setters 5.3 Otros métodos
	 */

	public Mesa() {
		super();
		this.numeroPatas = 4;

	}

	/**
	 * 
	 * @author Ander Uraga
	 * @param numeroPatas
	 */

	public Mesa(int numeroPatas) {
		super();
		this.numeroPatas = numeroPatas;
	}

	public int getNumeroPatas() {
		return this.numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	public int getPrecio() {
		return 0;
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

}
