package com.sirma.itt.javacourse.bridge;

/**
 * The class which will be decoupled from the interface.
 * 
 * @author Nikolay Ch
 * 
 */
public class QuestionManager implements Question {
	private Question questDB;

	/**
	 * Sets the current question to be the next one.
	 */
	public void nextQuestion() {
		getQuestDB().nextQuestion();
	}

	/**
	 * Adds a new question.
	 * 
	 * @param newQuestion
	 *            the new question which must be added
	 */
	public void newQuestion(String newQuestion) {
		getQuestDB().newQuestion(newQuestion);
	}

	/**
	 * Deletes a question.
	 * 
	 * @param questForDel
	 *            the question which must be deleted
	 */
	public void deleteQuestion(String questForDel) {
		getQuestDB().deleteQuestion(questForDel);
	}

	/**
	 * Displays all questions.
	 */
	public void displayAllQuestions() {
		getQuestDB().displayAllQuestions();
	}

	public Question getQuestDB() {
		return questDB;
	}

	public void setQuestDB(Question questDB) {
		this.questDB = questDB;
	}

}
