package com.sirma.itt.javacourse.builder;

/**
 * The abstract class. Every subclass must override its methods.
 * 
 * @author Nikolay Ch
 * 
 */
abstract class HouseBuilder {
	protected House house = new House();

	protected String showProgress() {
		return house.toString();
	}

	/**
	 * Builds the foundation.
	 */
	abstract public void buildFoundation();

	/**
	 * Builds the frame.
	 */
	abstract public void buildFrame();

	/**
	 * Builds the exterior.
	 */
	abstract public void buildExterior();

	/**
	 * Builds the interior.
	 */
	abstract public void buildInterior();
}