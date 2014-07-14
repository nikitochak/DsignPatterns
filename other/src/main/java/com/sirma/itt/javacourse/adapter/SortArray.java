package com.sirma.itt.javacourse.adapter;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Has a method for sorting an array of integers.
 * 
 * @author Nikolay Ch
 * 
 */
public class SortArray {
	/**
	 * Sorts an array by the method Arrays.sort .
	 * 
	 * @param <T>
	 * 
	 * @param array
	 *            the unsorted array
	 * @return the sorted array
	 */
	public static Integer[] sortArray(Integer[] array) {
		Arrays.sort(array, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {

				if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}

		});

		return array;
	}
}
