package com.sirma.itt.javacourse.command;

/**
 * The calculator takes two numbers and does some methods on them.
 * 
 * @author Nikolay Ch
 * 
 */
public class Calculator {
	int first;
	int second;

	/**
	 * Initializes the fields.
	 * 
	 * @param first
	 *            the value for the field first
	 * @param second
	 *            the value for the field second
	 */
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Sums the values.
	 * 
	 * @return the sum
	 */
	public int sum() {
		return first + second;
	}

	/**
	 * Multiplies the values.
	 * 
	 * @return the result
	 */
	public int multiply() {
		return first * second;
	}

	/**
	 * Divides the bigger number to the smaller.
	 * 
	 * @return the result
	 */
	public double divide() {
		return (double) Math.max(first, second) / Math.min(first, second);
	}

	/**
	 * Takes out from the biggest the smaller.
	 * 
	 * @return the result
	 */
	public int takeOut() {
		return Math.max(first, second) - Math.min(first, second);
	}

	/**
	 * Raises the bigger number to the smaller degree.
	 * 
	 * @return the result
	 */
	public int pow() {
		int number = Math.max(first, second);
		for (int i = 0; i < Math.min(first, second); i++) {
			number = number * Math.max(first, second);
		}
		return number;
	}

}
