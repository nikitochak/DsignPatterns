package com.sirma.itt.javacourse.factorym;

/**
 * The second product.
 * 
 * @author Nikolay Ch
 * 
 * 
 */
public class Product2 extends Product {

	public Product2(int cost, String name) {
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getCost() {
		return this.cost;
	}

	/**
	 * Prints both fields
	 */
	public void getBoth() {
		System.out.println(cost + " " + name);
	}
}
