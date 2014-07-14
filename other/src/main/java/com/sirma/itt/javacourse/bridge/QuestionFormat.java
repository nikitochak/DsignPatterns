package com.sirma.itt.javacourse.bridge;

/**
 * Extends the decoupling class.
 * 
 * @author Nikolay Ch
 * 
 */
class QuestionFormat extends QuestionManager {

	public void displayAll() {

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");
		super.displayAllQuestions();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
