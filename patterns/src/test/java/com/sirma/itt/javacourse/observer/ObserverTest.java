package com.sirma.itt.javacourse.observer;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests the observer design pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class ObserverTest {
	static Available available;
	static Unavailable unavailable;
	static Map<Object, Integer> inside;
	static ObserverProd observer = new ObserverProd();

	/**
	 * Initializes the needed objects.
	 */
	@BeforeClass
	public static void initaliza() {
		available = (Available) Available.makeInstance();
		unavailable = (Unavailable) Unavailable.makeInstance();

		inside = new HashMap<Object, Integer>();
		inside.put("Praskovi", 5);
		inside.put("domati", 13);
		inside.put("Banani", 4);

		available.addProductsNames(inside);
		available.addObserver(observer);
		unavailable.addObserver(observer);
	}

	/**
	 * Tests the remove from the available objects.
	 */
	@Test
	public void testRemoveFromAvailable() {

		available.remove("Banani", 5);
		assertEquals(2, available.getProducts().size());
		assertEquals(1, unavailable.getProducts().size());

	}

	/**
	 * Tests the remove from the unavailable objects.
	 */
	@Test
	public void testremoveFromUnavailabe() {
		unavailable.remove("Banani", 15);
		assertEquals(3, available.getProducts().size());
		assertEquals(0, unavailable.getProducts().size());
	}

}
