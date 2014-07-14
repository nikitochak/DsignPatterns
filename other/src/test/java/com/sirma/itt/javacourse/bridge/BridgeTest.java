package com.sirma.itt.javacourse.bridge;

import org.junit.Test;

/**
 * Tests the bridge design pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class BridgeTest {

	@Test
	public void testBridge() {
		QuestionFormat questions = new QuestionFormat();

		questions.setQuestDB(new JavaQuestions());

		questions.nextQuestion();

		questions.newQuestion("What is object? ");
		questions.newQuestion("What is reference type?");

		questions.displayAll();
	}

}
