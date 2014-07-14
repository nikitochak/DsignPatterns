package com.sirma.itt.javacourse.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the singleton pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class SingletonTest {

	/**
	 * Makes two instances of the SIngleton class. They must be
	 * equal(references).
	 */
	@Test
	public void testCreateInstance() {
		String oldSt = "Old";
		String newSt = "new";
		assertEquals(Singleton.makeInstance(oldSt, 2),
				Singleton.makeInstance(newSt, 2));

	}

}
