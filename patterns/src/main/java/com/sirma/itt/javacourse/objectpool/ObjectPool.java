package com.sirma.itt.javacourse.objectpool;

import java.util.HashMap;
import java.util.Map;

/**
 * Realizes the Object Pool Pattern. It has two maps, one of them keeps the
 * elements which are used in the moment. It also has two methods - for taking
 * out of the pool and for putting back into the pool.
 * 
 * @author Nikolay Ch
 * 
 */
public class ObjectPool {
	private static ObjectPool pool = null;
	private Map<Integer, Object> inUse = new HashMap<Integer, Object>(10);
	private Map<Integer, Object> outUse = new HashMap<Integer, Object>(10);
	private int toWhereIn = 0;
	private int toWhereOut = 0;
	private Object objectChange;
	private final int maxsize;

	/**
	 * Empty constructor for the initialization of the private field.
	 */
	private ObjectPool() {
		maxsize = 0;
	}

	/**
	 * The constructor which initializes the maps. Their maximum size must be n
	 * elements.
	 * 
	 * @param n
	 *            the maximum size of the pool
	 * @param objects
	 *            the map with the objects
	 */
	private ObjectPool(int n, Map<Integer, Object> objects) {
		maxsize = n;
		for (int i = 0; i < n; i++) {
			outUse.put(i, objects.get(i));

		}
		toWhereOut = n - 1;
		inUse = new HashMap<Integer, Object>(n);
	}

	/**
	 * Makes a pool only if there is not another. It is a singleton.
	 * 
	 * @param n
	 *            the maximum size of the elements
	 * @param inside
	 *            the map with the objects
	 * @return
	 * @return the instance of the pool
	 */
	public static ObjectPool addToPool(int n, Map<Integer, Object> inside) {
		pool = new ObjectPool(n, inside);
		return pool;
	}

	/**
	 * Takes one of the objects out of the pool.
	 */
	public void acquire() {
		if (toWhereOut >= 0) {
			objectChange = outUse.get(toWhereOut);

			inUse.put(toWhereIn, objectChange);

			toWhereIn++;
			toWhereOut--;

		} else {
			toWhereOut = 0;
			toWhereIn = maxsize - 1;
			throw new ArrayIndexOutOfBoundsException("The pool is empty.");
		}

	}

	/**
	 * Returns one of the using objects into the pool.
	 */
	public void release() {

		if (toWhereOut >= 0) {
			objectChange = inUse.get(toWhereOut);

			outUse.replace(toWhereIn, objectChange);
			toWhereIn++;
			toWhereOut--;

		} else {
			throw new ArrayIndexOutOfBoundsException("The pool is full.");
		}

	}

	/**
	 * Getter for the number of the objects in use.
	 * 
	 * @return the number of the objects in use
	 */
	public int getToWhereIn() {
		return toWhereIn;
	}

	/**
	 * Getter for the number of the objects out of use.
	 * 
	 * @return the number of the objects out of use
	 */
	public int getToWhereOut() {
		return toWhereOut;
	}

	/**
	 * Makes an instance of the pool.
	 * 
	 * @return the instance
	 */
	public static ObjectPool getInstance() {

		return pool;

	}

	/**
	 * Getter for the map which keeps the objects in use.
	 * 
	 * @return the map
	 */
	public Map<Integer, Object> getInUse() {
		return this.inUse;
	}

	/**
	 * Getter for the map which keeps the objects out use.
	 * 
	 * @return the map
	 */
	public Map<Integer, Object> getOutUse() {
		return this.outUse;
	}
}
