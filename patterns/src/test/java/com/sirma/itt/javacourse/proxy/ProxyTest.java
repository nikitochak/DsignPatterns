package com.sirma.itt.javacourse.proxy;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests the proxy pattern.
 * 
 * @author Nikolay Ch
 * 
 * 
 */
public class ProxyTest {

	private static ProxyInteger proxy;

	/**
	 * Makes an instance of the proxy class.
	 */
	@BeforeClass
	public static void initialize() {
		proxy = new ProxyInteger(54);
	}

	/**
	 * Tests the method which returns info for the instance ot the real class in
	 * the proxy.
	 */
	@Test
	public void testDisplayInfoWhenMakingAnInstance() {
		assertEquals(proxy.isThereInstance(), "Making new instance.");
	}

	/**
	 * Does the same as the previous but the instance is already created.
	 */
	@Test
	public void testDisplayInfoWhenAlreadyMadeInstance() {
		assertEquals(proxy.isThereInstance(), "Already made.");
	}
}
