package com.sirma.itt.javacourse.proxy;

/**
 * The interface with the methods for the realization of the proxy pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public interface Integer {
	/**
	 * Displays when an instance is creating.
	 */
	public String isThereInstance();

	/**
	 * Getter for the integer field.
	 * 
	 * @return the value of the field
	 */
	public int getValue();
}
