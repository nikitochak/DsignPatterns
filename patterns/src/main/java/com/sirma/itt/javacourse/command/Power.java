package com.sirma.itt.javacourse.command;

/**
 * The class for raising to a degree.
 * 
 * @author Nikolay Ch
 * 
 */
public class Power implements Command {
	Calculator calculator;

	/**
	 * Initializes the calculator.
	 * 
	 * @param calculator
	 *            the value
	 */
	public Power(Calculator calculator) {
		this.calculator = calculator;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.command.Command#execute()
	 */
	public Object execute() {
		return calculator.pow();
	}
}
