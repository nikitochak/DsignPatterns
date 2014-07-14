package com.sirma.itt.javacourse.builder;

/**
 * Builds the house.
 * 
 * @author Nikolay Ch
 * 
 */
public class WorkShop {
	// force the order of building process
	/**
	 * Constructs the house.
	 * 
	 * @param hb
	 *            the house builder
	 */
	public void construct(HouseBuilder hb) {
		hb.buildFoundation();
		hb.buildFrame();
		hb.buildExterior();
		hb.buildInterior();
	}
}
