package com.sirma.itt.javacourse.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * Keeps the available products.
 * 
 * @author Nikolay Ch
 * 
 */
public class Available extends Observable implements Products {
	private static Available available;
	private Map<Object, Integer> availableProducts;

	/**
	 * Helps for that this class must hava just one instance.
	 */
	private Available() {
		availableProducts = new HashMap<Object, Integer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.observer.Products#add(java.lang.Object)
	 */
	public void add(Object deliveredProducts, int amount) {
		this.availableProducts.put(deliveredProducts, amount);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.observer.Products#remove(java.lang.Object)
	 */
	public void remove(Object notAvailableYet, int amount) {
		if (availableProducts.get(notAvailableYet) > amount) {
			availableProducts.replace(notAvailableYet,
					availableProducts.get(notAvailableYet) - amount);
		} else {
			availableProducts.remove(notAvailableYet);
			setChanged();
			notifyObservers(notAvailableYet);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.observer.Products#makeInstance()
	 */
	public static Products makeInstance() {
		if (available == null) {
			available = new Available();

		}
		return available;
	}

	/**
	 * Getter for the collection with the objects.
	 * 
	 * @return the collection with the objects
	 */
	public Map<Object, Integer> getProducts() {
		return this.availableProducts;
	}

	/**
	 * Adds products. This is always used in the beginning.
	 * 
	 * @param products
	 *            the map with the products and their quantity.
	 */
	public void addProductsNames(Map<Object, Integer> products) {
		availableProducts = products;
	}

}
