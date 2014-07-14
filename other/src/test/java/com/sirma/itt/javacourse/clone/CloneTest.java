package com.sirma.itt.javacourse.clone;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the cloning of a sheep. Makes an instance of the sheep and then clones
 * it.
 * 
 * @author Nikolay Ch
 * 
 */
public class CloneTest {
	private static Sheep sheepMother = new Sheep();
	private static Sheep sheepCloning;

	/**
	 * Sets some different data in the cloned sheep and compares if with the
	 * data in the original sheep.
	 * 
	 * @throws CloneNotSupportedException
	 *             if the class has not implemented the Cloneable interface
	 */
	@Test
	public void testClone() throws CloneNotSupportedException {
		sheepCloning = (Sheep) sheepMother.clone();

		sheepCloning.setChild("Vera");
		sheepCloning.setChild("Tonka");
		String[] motherChildren = sheepMother.getChildren();

		assertEquals(motherChildren[0], sheepCloning.getChildren()[0]);
		assertEquals(motherChildren[1], sheepCloning.getChildren()[1]);
	}

}
