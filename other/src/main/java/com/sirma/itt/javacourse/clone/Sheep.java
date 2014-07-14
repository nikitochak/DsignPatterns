package com.sirma.itt.javacourse.clone;

/**
 * The class which can be cloned.
 * 
 * @author Nikolay Ch
 * 
 */
public class Sheep implements Cloneable {

	private String[] nameChildren = new String[3];
	private int how = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * Sets some strings in the array.
	 * 
	 * @param name
	 *            the value which will be put in the array
	 * @throws ArrayIndexOutOfBoundsException
	 *             when the array with the childrens'names is full.
	 */
	public void setChild(String name) {
		if (how < 3) {
			nameChildren[how] = name;
			how++;
		} else {
			throw new ArrayIndexOutOfBoundsException("Too many children.");
		}

	}

	/**
	 * Getter for the array.
	 * 
	 * @return the array
	 */
	public String[] getChildren() {
		return this.nameChildren;
	}
}
