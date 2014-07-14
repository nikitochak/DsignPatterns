package com.sirma.itt.javacourse.abstractfactory;

import java.lang.reflect.Constructor;

/**
 * The client class. Builds a product.
 * 
 * @author Nikolay Ch
 * 
 */
public class Client {
	private AbstractProduct product;

	/**
	 * Makes a new product depending on what kind of factory it takes.
	 * 
	 * @param widgetFactory
	 *            the kind of factory it takes
	 * @return the made product
	 */

	public AbstractProduct makeAProduct(AbstractFactory factory, String name) {
		product = factory.createProduct(name);
		return this.product;
	}

	/**
	 * Makes an instance by a reflection. First makes a class from the class
	 * path and then makes an instance form that class.
	 * 
	 * @param classpath
	 *            the path that specifies the class
	 * @param name
	 *            the value for the title
	 * @return the created instance of a product
	 * @throws Exception
	 *             when an error occures
	 */

	public AbstractProduct createInstance(String classpath, String name)
			throws Exception {
		Class<?> c = Class.forName(classpath);
		AbstractFactory factory;
		Constructor<?> constr = c.getConstructor();

		factory = (AbstractFactory) constr.newInstance();
		product = factory.createProduct(name);
		return product;
	}
}
