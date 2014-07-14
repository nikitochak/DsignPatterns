package com.sirma.itt.javacourse.command;

/**
 * The command class for summing
 * 
 * @author Nikolay Ch
 * 
 */
public class Summing implements Command {
	Calculator calculator;

	/**
	 * Initializes the calculator.
	 * 
	 * @param calculator
	 *            the value
	 */
	public Summing(Calculator calculator) {
		this.calculator = calculator;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.command.Command#execute()
	 */
	public Object execute() {
		return calculator.sum();
	}
}
