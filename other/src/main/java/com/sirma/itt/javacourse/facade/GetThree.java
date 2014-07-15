package com.sirma.itt.javacourse.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Has a method for finding some numbers in an interval.
 * 
 * @author Nikolay Ch
 * 
 */
public class GetThree {
	/**
	 * Looks which numbers in an interval divided by three are integers.
	 * 
	 * @param startInterval
	 *            the first number of the interval
	 * @param endInterval
	 *            the second number in the interval
	 * @return the list with all satisfying numbers
	 */
	public List<Integer> getTree(int startInterval, int endInterval) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = startInterval; i <= endInterval; i++) {
			if (i % 3 == 0) {
				numbers.add(i);
			}
		}
		return numbers;
	}
}
