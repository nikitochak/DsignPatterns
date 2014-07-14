package com.sirma.itt.javacourse.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter which has a method for sorting a list by invoking the method for
 * sorting an array.
 * 
 * @author Nikolay Ch
 * 
 */
public class SortAdapter implements Sort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.adapter.Sort#sort(java.util.List)
	 */
	public List<Integer> sort(List<Integer> list) {
		Integer[] array = new Integer[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		array = SortArray.sortArray(array);
		List<Integer> sorted = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {

			sorted.add(i, array[i]);
		}

		return sorted;
	}
}
