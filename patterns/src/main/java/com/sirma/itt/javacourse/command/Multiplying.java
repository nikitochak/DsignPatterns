package com.sirma.itt.javacourse.command;

/**
 * The command class for the multiplying.
 * 
 * @author Nikolay Ch
 * 
 */
public class Multiplying implements Command {

	Calculator calculator;

	/**
	 * Initializes the calculator.
	 * 
	 * @param calculator
	 *            the value
	 */
	public Multiplying(Calculator calculator) {
		this.calculator = calculator;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.command.Command#execute()
	 */
	public Object execute() {
		return calculator.multiply();
	}
}
