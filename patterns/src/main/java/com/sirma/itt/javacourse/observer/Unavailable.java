package com.sirma.itt.javacourse.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * The class which keeps the unavailable objects.
 * 
 * @author Nikolay Ch
 * 
 * 
 */
public class Unavailable extends Observable implements Products {
	private List<Object> unavailableProducts;
	private static Unavailable unavailable;

	/**
	 * Private constructor which helps the instance to be just one.
	 */
	private Unavailable() {
		unavailableProducts = new ArrayList<Object>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.observer.Products#add(java.lang.Object)
	 */
	public void add(Object unAvProduct, int amount) {
		unavailableProducts.add(unAvProduct);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.observer.Products#remove(java.lang.Object)
	 */
	public void remove(Object deliveredProduct, int amount) {
		int whereToDel = unavailableProducts.indexOf(deliveredProduct);
		unavailableProducts.remove(whereToDel);
		setChanged();
		notifyObservers(deliveredProduct);
	}

	/**
	 * Makes an instance of the singleton class. Must exist just two objects one
	 * for the available products and for the unavailable products.
	 * 
	 * @return
	 */
	public static Products makeInstance() {
		if (unavailable == null) {
			unavailable = new Unavailable();
		}
		return unavailable;
	}

	/**
	 * Getter for the collection with the objects.
	 * 
	 * @return the collection with the objects
	 */
	public List<Object> getProducts() {
		return this.unavailableProducts;
	}

}
