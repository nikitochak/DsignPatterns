package com.sirma.itt.javacourse.proxy;

/**
 * 
 * The real class where are the actuals methods.
 * 
 * @author Nikolay Ch
 * 
 */
public class RealInteger implements Integer {

	private int number;

	/**
	 * Initializes the field number.
	 * 
	 * @param number
	 *            the value for the field
	 */
	public RealInteger(int number) {
		this.number = number;
	}

	/*
	 * (non-Javadoc) 
	 * 
	 * @see com.sirma.itt.javacourse.proxy.Integer#displayInfo()
	 */
	public String isThereInstance() {
		return "Making new instance.";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.proxy.Integer#getValue()
	 */
	public int getValue() {

		return number;
	}

}
