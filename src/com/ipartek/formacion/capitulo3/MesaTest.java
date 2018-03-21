package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MesaTest {

	@Test
	public void testMesa() {
		Mesa mesa = new Mesa();
		assertEquals(4, mesa.getNumeroPatas());
		assertEquals("blanco", mesa.getColor());
		assertEquals(1, mesa.getDimension());
		assertEquals(Mesa.MATERIAL_MADERA, mesa.getMaterial());
	}

	@Test
	public void testMesaInt() {
		final int MATERIAL_NO_EXISTENTE = -1;

		Mesa mesa = new Mesa(MATERIAL_NO_EXISTENTE);
		assertEquals(MATERIAL_NO_EXISTENTE, mesa.getMaterial());
	}

	@Test
	public void testSetNumeroPatas() {
		Mesa mesa = new Mesa();
		mesa.setNumeroPatas(5);
		assertEquals(5, mesa.getNumeroPatas());

		mesa.setNumeroPatas(0);
		assertEquals(1, mesa.getNumeroPatas());

		mesa.setNumeroPatas(-5);
		assertEquals(1, mesa.getNumeroPatas());
	}

	@Test
	public void testGetPrecio() {

		final int PRECIO_BASE = 13;
		int precio = 0;

		Mesa mesa = new Mesa();
		assertEquals(PRECIO_BASE, mesa.getPrecio());

		mesa.setColor(Mesa.PRECIO_COLOR_NAME_CUSTOM);
		assertEquals((PRECIO_BASE + Mesa.PRECIO_COLOR_NAME_CUSTOM), mesa.getPrecio());

		mesa.setMaterial(Mesa.MATERIAL_ACERO);
		precio = PRECIO_BASE - Mesa.PRECIO_MATERIAL_MADERA + Mesa.PRECIO_MATERIAL_ACERO;
		assertEquals(precio, mesa.getPrecio());

		// TODO probar resto de materiales

		// Dimension
		mesa = new Mesa();
		int nuevaDimension = 5;
		mesa.setDimension(nuevaDimension);
		precio = PRECIO_BASE + (mesa.PRECIO_M2 * mesa.getDimension() - (1 * Mesa.PRECIO_M2));
		assertEquals(precio, mesa.getPrecio());

		// Numero Patas
		mesa = new Mesa();
		int numeroPatas = 8;
		mesa.setNumeroPatas(numeroPatas);
		precio = PRECIO_BASE + (Mesa.PRECIO_PATA * mesa.getNumeroPatas());
		assertEquals(precio, mesa.getPrecio());

		mesa = new Mesa();
		mesa.setNumeroPatas(-4);
		assertEquals(PRECIO_BASE - (3 * Mesa.PRECIO_PATA), mesa.getPrecio());

	}

	@Test
	public void comparar() {

		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa();

		assertEquals(m1.getNumeroPatas(), m2.getNumeroPatas());

		assertTrue(m1.equals(m2));

		String a = "hola";
		String b = "hola";

		assertTrue(a == b);
		assertTrue(a.equals(b));

	}

	@Test
	public void pasoValorYreferencia() {

		// Paso parámetro por valor
		// Siempre para primitivas
		int a = 0;
		int b = sumar(a);

		assertEquals(0, a);
		assertEquals(1, b);

		Mesa mesaA = new Mesa();
		Mesa mesaB = sumarPata(mesaA);

		// Mesa mesaC = (Mesa) mesaA.clone();

		assertEquals(5, mesaA.getNumeroPatas());
		assertEquals(5, mesaB.getNumeroPatas());

	}

	int sumar(int num) {
		return ++num;
	}

	Mesa sumarPata(Mesa m) {
		m.setNumeroPatas(m.getNumeroPatas() + 1);
		return m;
	}

}
