package com.sirma.itt.javacourse.adapter;

import java.util.List;

/**
 * Has a method for sorting a List.
 * 
 * @author Nikolay Ch
 * 
 */
public interface Sort {
	/**
	 * Sorts a list of integers.
	 * 
	 * @param list
	 *            the unsorted list
	 * @return the sorted list
	 */
	public List<Integer> sort(List<Integer> list);
}
