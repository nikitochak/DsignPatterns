package com.sirma.itt.javacourse.bridge;

/**
 * 
 * The abstraction for the Bridge Pattern.
 * 
 * @author Nikolay Ch
 * 
 */
interface Question {

	/**
	 * Sets the current question to be the next one.
	 */
	public void nextQuestion();

	/**
	 * Adds a new question.
	 * 
	 * @param newQuestion
	 *            the new question which must be added
	 */
	public void newQuestion(String newQuestion);

	/**
	 * Deletes a question.
	 * 
	 * @param questForDel
	 *            the question which must be deleted
	 */
	public void deleteQuestion(String questForDel);

	/**
	 * Displays all questions.
	 */
	public void displayAllQuestions();
}