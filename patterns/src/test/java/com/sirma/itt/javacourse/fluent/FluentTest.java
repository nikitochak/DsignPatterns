package com.sirma.itt.javacourse.fluent;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the fluent interface pattern.
 * 
 * @author Nikolay Ch
 * 
 */
public class FluentTest {
	private String to;
	private String from;
	private String subject;
	private String content;

	/**
	 * Tests the methods in the BuildMail class which implements the fluent
	 * interface pattern.
	 * 
	 * @throws Exception
	 *             when an error occurs
	 */
	@Test
	public void testBuildMethods() throws Exception {
		BuildMail mail = new BuildMail();
		to = "Ivan";
		from = "Toni";
		subject = "For the game info";
		content = "Please help me to raise level in the game.";

		mail.content(content).attachemtns("ivan", 435).from(from).to(to)
				.subject(subject).build();

		assertEquals(mail.getTo(), to);
		assertEquals(mail.getFrom(), from);
		assertEquals(mail.getSubject(), subject);
		assertEquals(mail.getContent(), content);
	}

	/**
	 * tries to build the mail without the obligatory fields.
	 * 
	 * @throws Exception
	 *             when the error is catched
	 */
	@Test(expected = Exception.class)
	public void testBuildMethodsWithoutTo() throws Exception {
		BuildMail mail = new BuildMail();

		from = "Toni";
		subject = "For the game info";
		content = "Please help me to raise level in the game.";

		mail.content(content).attachemtns("ivan", 435).from(from)
				.subject(subject).build();

	}

}
