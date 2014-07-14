package com.sirma.itt.javacourse.factorym;

/**
 * The abstract class that sums all common features of the products.
 * 
 * @author Admin
 * 
 */
abstract class Product {
	protected String name;
	protected int cost;

	/**
	 * Getter for the name field.
	 * 
	 * @return the value of the field
	 */
	public abstract String getName();

	/**
	 * Getter for the cost field.
	 * 
	 * @return the value of the field
	 */
	public abstract int getCost();

}
