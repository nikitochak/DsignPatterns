package com.sirma.itt.javacourse.singleton;

/**
 * Realizes the Singleton design pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class Singleton {

	private String name;
	private int number;
	private static Singleton object = null;

	/**
	 * Private constructor which prevents from making many instances of the
	 * class.
	 * 
	 * @param name
	 *            the value for the name field
	 * @param number
	 *            the value for the number field
	 */
	private Singleton(String name, int number) {
		this.name = name;
		this.number = number;
	}

	/**
	 * This method makes an instance of the Singleton class. If the private
	 * object is equal to null it makes it new instance. Else returns the
	 * current instance object.
	 * 
	 * @param name
	 *            the value for the name field
	 * @param number
	 *            the value for the number field
	 * @return the instance of the object
	 */
	public static Singleton makeInstance(String name, int number) {
		if (object == null) {

			object = new Singleton(name, number);
			return object;
		} else {
			return object;
		}
	}

	/**
	 * Getter for the number field.
	 * 
	 * @return the value
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Getter for the name field.
	 * 
	 * @return the value of this field
	 */
	public String getName() {
		return name;
	}

}
