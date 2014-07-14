package com.sirma.itt.javacourse.objectpool;

import static org.junit.Assert.*;


import java.util.HashMap;
import java.util.Map;


import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * Tests the object pool pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class ObjectPoolTest {

	private static ObjectPool pool;
	private static Map<Integer, Object> inside;
	private static int n;

	/**
	 * Initializes the pool and the max size.
	 */
	@BeforeClass
	public static void initialize() {
		inside = new HashMap<Integer, Object>();
		for (int i = 0; i < 10; i++) {
			inside.put(i, new Data(i, "Ivo"));
		}
		n = (int) (Math.random() * 5) + 5;

		pool = ObjectPool.addToPool(n, inside);
	}

	/**
	 * Tests the method acquire with one more than the max size. Must throw
	 * ArrayIndexOutOfBoundsException.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testAcquire() {

		for (int i = 0; i < n; i++) {
			pool.acquire();

		}
		// System.out.println(pool.getToWhereIn());
		// System.out.println(pool.getToWhereOut());
	}

	/**
	 * Tests the method acquire with one more than the max size. Must throw
	 * ArrayIndexOutOfBoundsException.
	 */
	@Test
	public void testRelease() {
		System.out.println(pool.getToWhereIn());
		System.out.println(pool.getToWhereOut());
		inside = pool.getInUse();
		for (int i = 0; i < n; i++) {
			pool.release();

			assertEquals(pool.getToWhereIn()-1, i);
		}

	}

}
