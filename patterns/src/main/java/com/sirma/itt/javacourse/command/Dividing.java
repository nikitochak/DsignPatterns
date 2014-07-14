package com.sirma.itt.javacourse.command;

/**
 * The command class for dividing.
 * 
 * @author Nikolay Ch
 * 
 */
public class Dividing implements Command {

	Calculator calculator;

	/**
	 * Initializes the calculator.
	 * 
	 * @param calculator
	 *            the value
	 */
	public Dividing(Calculator calculator) {
		this.calculator = calculator;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.command.Command#execute()
	 */
	public Object execute() {
		return calculator.divide();
	}
}
