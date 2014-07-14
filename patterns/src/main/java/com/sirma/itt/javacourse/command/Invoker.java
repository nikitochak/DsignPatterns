package com.sirma.itt.javacourse.command;

/**
 * The invoker class in the command dsign pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class Invoker {
	private Command command;

	/**
	 * Initializes the command.
	 * 
	 * @param command
	 *            the value
	 */
	public Invoker(Command command) {
		this.command = command;
	}

	/**
	 * Executes the command.
	 * 
	 * @return
	 */
	public Object pressOperation() {
		return command.execute();
	}
}
