package com.sirma.itt.javacourse.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the Abstract Factory pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class AbstractFactoryTest {
	private static AbstractProduct[] products;
	private static AbstractFactory[] factories;

	/**
	 * Makes an instances by a method and by reflection. Then compares if the
	 * instances has been created normally.
	 * 
	 * @throws Exception
	 *             when an error occurs
	 */
	@Test
	public void test() throws Exception {

		factories = new AbstractFactory[2];
		products = new AbstractProduct[2];

		factories[0] = new Factory1();
		factories[1] = new Factory2();

		Client builder = new Client();

		String classpath = Factory2.class.getName();

		products[0] = builder.makeAProduct(factories[0], "Ivan");
		products[1] = (AbstractProduct) builder.createInstance(classpath,
				"Toni");

		assertEquals("Ivan", products[0].getTitle());
		assertEquals("Toni", products[1].getTitle());
	}
}
