package com.sirma.itt.javacourse.factorym;

/**
 * Build the products. Play the role of the factory.
 * 
 * @author Nikolay Ch
 * 
 */
public class Factory {
	private Product product;

	/**
	 * Constructs a product of the second kind.
	 * 
	 * @param cost
	 *            the value for field cost
	 * @param name
	 *            the value for the field name
	 * @param quantity
	 *            the value for the field quantity
	 */
	public Factory(int cost, String name, int quan) {
		product = new Product1(cost, name, quan);
	}

	/**
	 * Constructs a product of the second kind.
	 * 
	 * @param cost
	 *            the value for field cost
	 * @param name
	 *            the value for the field name
	 */
	public Factory(int cost, String name) {
		product = new Product2(cost, name);
	}

	/**
	 * Returns the instance of the Product.
	 * 
	 * @return the product
	 */
	public Product getProduct() {
		return this.product;
	}

}
