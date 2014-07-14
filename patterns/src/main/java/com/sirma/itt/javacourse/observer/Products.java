package com.sirma.itt.javacourse.observer;

/**
 * Interface which describes the methods in each class which keeps the
 * information for the products.
 * 
 * @author Nikolay Ch
 * 
 */
public interface Products {
	/**
	 * When a product must be add to the list. For example, some apples has been
	 * delivered so they must be add to the list with the available products.
	 * 
	 * @param o
	 *            the product that must be add to the list
	 * @param amount
	 *            the amount of products sold/delivered
	 */
	public void add(Object o, int amount);

	/**
	 * Makes the changes when a product is removed. For example a product has
	 * been unavailable but now someone has delivered some of it. Then the
	 * product must be removed from the unavailable products.
	 * 
	 * @param o
	 *            the product that must be removed from the current list
	 * @param amount
	 *            the amount of the products delivered/sold
	 */
	public void remove(Object o, int amount);

}
