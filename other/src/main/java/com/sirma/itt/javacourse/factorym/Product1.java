package com.sirma.itt.javacourse.factorym;

/**
 * The first product of the factory.
 * 
 * @author Nikolay Ch
 * 
 */
public class Product1 extends Product {

	int quantity;

	/**
	 * Initializes the fields.
	 * 
	 * @param cost
	 *            the value for the field cost
	 * @param name
	 *            the value for the field name
	 */
	public Product1(int cost, String name, int quantity) {
		this.cost = cost;
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		return this.name;

	}

	@Override
	public int getCost() {
		return this.cost;
	}

}
