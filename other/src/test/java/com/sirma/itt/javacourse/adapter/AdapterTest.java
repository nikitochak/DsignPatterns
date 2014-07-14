package com.sirma.itt.javacourse.adapter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests the adapter design pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class AdapterTest {

	/**
	 * Makes a list an sorts it by the method in the adapter. Checks if the list
	 * has been sorted properly.
	 */
	@Test
	public void testSort() {
		SortAdapter adapter = new SortAdapter();
		List<Integer> list = new ArrayList<Integer>(10);

		for (int i = 0; i < 10; i++) {
			list.add(i, i);
		}

		list = adapter.sort(list);

		for (Integer i = 9, j = 0; i >= 0; i--, j++) {

			assertEquals(list.get(j), i);
		}

	}

}
