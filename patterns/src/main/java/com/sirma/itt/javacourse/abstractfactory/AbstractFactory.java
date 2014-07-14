package com.sirma.itt.javacourse.abstractfactory;

/**
 * The abstract factory.
 * 
 * @author Nikolay Ch
 * 
 */
public interface AbstractFactory {
	/**
	 * Creates a product from the factories.
	 * 
	 * @param name
	 *            the value for the title of the product.
	 * @return the product
	 */
	public AbstractProduct createProduct(String name);
}

/**
 * The first concrete factory.
 * 
 * @author Nikolay Ch
 * 
 */
class Factory1 implements AbstractFactory {

	private Product1 product;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sirma.itt.javacourse.abstractfactory.AbstractFactory#createProduct
	 * (java.lang.String)
	 */
	public AbstractProduct createProduct(String name) {
		this.product = new Product1();
		this.product.setTitle(name);
		return this.product;
	}
}
