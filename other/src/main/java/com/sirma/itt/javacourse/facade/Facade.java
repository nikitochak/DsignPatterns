package com.sirma.itt.javacourse.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Plays the role of the facade in the facade design pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class Facade {
	private GetThree three = new GetThree();
	private GetFour four = new GetFour();

	/**
	 * Unites the methods for finding the numbers divided by three and four.
	 * 
	 * @param start
	 *            the beginning of the interval
	 * @param end
	 * @return the list with the numbers which divided by four and three are
	 *         integers
	 */
	public List<Integer> getNumbers(int start, int end) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers = three.getTree(start, end);
		numbers.addAll(four.getFour(start, end));

		return numbers;

	}

}
