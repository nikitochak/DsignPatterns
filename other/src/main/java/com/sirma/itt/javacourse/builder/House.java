package com.sirma.itt.javacourse.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * The house with its features and type.
 * 
 * @author Nikolay Ch
 * 
 */
public class House {

	private String type = null;
	private List<String> features = new ArrayList<String>();

	public House() {

	}

	/**
	 * Constructor. Initializes the field type.
	 * 
	 * @param type
	 *            the value
	 */
	public House(String type) {
		this.type = type;
	}

	/**
	 * Setter for the type of the house.
	 * 
	 * @param type
	 *            the value for the type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter for the type of the house.
	 * 
	 * @return the type of the house
	 */
	public String getType() {
		return type;
	}

	/**
	 * Adds new process to the list with the processes.
	 * 
	 * @param s
	 *            the process
	 */
	public void setProgress(String s) {
		features.add(s);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer ff = new StringBuffer();
		String t = type.substring(6);
		ff.append(t + "\n ");
		for (int i = 0; i < features.size(); i++) {
			ff.append(features.get(i) + "\n ");
		}
		return ff.toString();
	}
}
