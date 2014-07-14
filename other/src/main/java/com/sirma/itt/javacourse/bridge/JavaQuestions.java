package com.sirma.itt.javacourse.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the interface.
 * 
 * @author Nikolay Ch
 * 
 */
class JavaQuestions implements Question {

	private List<String> questions = new ArrayList<String>();
	private int current = 0;

	/**
	 * Adds some questions to the list.
	 */
	public JavaQuestions() {

		questions.add("What is Java? ");
		questions.add("What is an interface? ");
		questions.add("What is cross-platform? ");
		questions.add("What is UFT-8? ");
		questions.add("What is abstract? ");
		questions.add("What is Thread? ");
		questions.add("What is multi-threading? ");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.bridge.Question#nextQuestion()
	 */
	public void nextQuestion() {
		if (current <= questions.size() - 1)
			current++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sirma.itt.javacourse.bridge.Question#newQuestion(java.lang.String)
	 */
	public void newQuestion(String quest) {
		questions.add(quest);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sirma.itt.javacourse.bridge.Question#deleteQuestion(java.lang.String)
	 */
	public void deleteQuestion(String quest) {
		questions.remove(quest);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.bridge.Question#displayAllQuestions()
	 */
	public void displayAllQuestions() {
		for (String quest : questions) {
			System.out.println(quest);
		}
	}
}
