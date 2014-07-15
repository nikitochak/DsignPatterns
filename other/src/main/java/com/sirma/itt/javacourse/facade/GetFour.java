package com.sirma.itt.javacourse.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Has a method which finds the numbers in an interval that divided by four are
 * integer.
 * 
 * @author Nikolay Ch
 * 
 */
public class GetFour {

	/**
	 * This method has a list where saves the numbers that divided by four are
	 * integers.
	 * 
	 * @param startInterval
	 *            the beginning of the interval
	 * @param finishInterval
	 *            the end of the interval
	 * @return the list with the numbers
	 */
	public List<Integer> getFour(int startInterval, int finishInterval) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = startInterval; i <= finishInterval; i++) {
			if (i % 4 == 0) {
				numbers.add(i);
			}
		}
		return numbers;

	}
}
