package com.sirma.itt.javacourse.objectpool;

/**
 * This class has some data.
 * 
 * @author Nikolay Ch
 * 
 */
public class Data {
	private int number;
	private String name;

	/**
	 * Initializes the fields.
	 * 
	 * @param n
	 *            the value for the number
	 * @param name
	 *            the vali for the name
	 */
	public Data(int n, String name) {
		this.number = n;
		this.name = name;
	}

	/**
	 * Getter for the field name.
	 * 
	 * @return the value of the field
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the field name.
	 * 
	 * @param name
	 *            the value for the field
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the filed number.
	 * 
	 * @return the value of the filed
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Setter for the field number
	 * 
	 * @param number
	 *            the value for the field
	 */
	public void setNumber(int number) {
		this.number = number;
	}
}
