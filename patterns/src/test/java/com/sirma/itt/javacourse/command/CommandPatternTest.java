package com.sirma.itt.javacourse.command;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Plays the role of the client in the command design pattern and tests the
 * commands.
 * 
 * @author Nikolay Ch
 * 
 */
public class CommandPatternTest {
	private Invoker invoker;
	private static Calculator calculator;
	private static Scanner scan;
	private static int first;
	private static int second;

	/**
	 * Initializes the necessary objects.
	 */
	@BeforeClass
	public static void initialize() {
		scan = new Scanner(System.in);
		first = scan.nextInt();
		second = scan.nextInt();
		calculator = new Calculator(first, second);
	}

	/**
	 * Tests the commands.
	 */
	@Test
	public void testCommands() {
		Dividing div = new Dividing(calculator);
		Multiplying multi = new Multiplying(calculator);
		Summing sum = new Summing(calculator);
		invoker = new Invoker(sum);
		int num = (Integer) invoker.pressOperation();

		assertEquals(first + second, num);
		invoker = new Invoker(multi);
		assertEquals(first * second, invoker.pressOperation());

		invoker = new Invoker(div);
		assertEquals((double) first / second, invoker.pressOperation());

	}

}
