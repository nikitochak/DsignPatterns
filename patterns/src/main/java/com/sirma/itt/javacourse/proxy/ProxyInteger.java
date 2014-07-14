package com.sirma.itt.javacourse.proxy;

/**
 * The proxy class which creates instances from the real Integer class.
 * 
 * @author Nikolay Ch
 * 
 */
public class ProxyInteger implements Integer {
	private RealInteger realInt;
	private int number;

	/**
	 * Initializes the field number.
	 * 
	 * @param number
	 *            the value for the field
	 */
	public ProxyInteger(int number) {
		this.number = number;
	}

	/**
	 * Makes an instance from the real class.
	 */
	private String createInstance() {
		realInt = new RealInteger(number);
		return realInt.isThereInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.proxy.Integer#displayInfo()
	 */
	public String isThereInstance() {
		if (realInt == null) {
			return createInstance();
		}
		return "Already made.";

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.proxy.Integer#getValue()
	 */
	public int getValue() {

		if (realInt == null) {
			createInstance();
		}

		return realInt.getValue();
	}

}
