package com.sirma.itt.javacourse.abstractfactory;

/**
 * 
 * The second concrete factory.
 * 
 * @author Nikoay Ch
 * 
 */
class Factory2 implements AbstractFactory {

	private Product2 product;

	/**
	 * The constructor needed when making an instance by a reflection.
	 */
	public Factory2() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sirma.itt.javacourse.abstractfactory.AbstractFactory#createProduct
	 * (java.lang.String)
	 */
	public AbstractProduct createProduct(String name) {
		this.product = new Product2();
		this.product.setTitle(name);
		return product;
	}
}
