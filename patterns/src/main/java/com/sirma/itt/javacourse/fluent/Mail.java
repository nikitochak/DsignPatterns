package com.sirma.itt.javacourse.fluent;

/**
 * The fluent interface.
 * 
 * @author Nikolay Ch
 * 
 */
public interface Mail {

	/**
	 * This methods is for initializing the to filed in the instance that will
	 * be returned.
	 * 
	 * @param to
	 *            the value
	 * @return the instance with the initialized field to
	 */
	public Mail to(String to);

	/**
	 * Initializes the field from.
	 * 
	 * @param from
	 *            the value for the field
	 * @return the instance with already initialized field
	 */
	public Mail from(String from);

	/**
	 * Initializes the the field subject.
	 * 
	 * @param subject
	 *            the value for the field
	 * @return the instance with already initialized field
	 */
	public Mail subject(String subject);

	/**
	 * Initializes the content field.
	 * 
	 * @param content
	 *            the value for the field
	 * @return the instance with already initialized field
	 */
	public Mail content(String content);

	/**
	 * Method for initializing the attachments.
	 * 
	 * @param objects
	 *            the attachments
	 * @return the instance with the already initialized attachments
	 */
	public Mail attachemtns(Object... objects);

	/**
	 * Checks if every obligatory field is full.
	 * 
	 * @throws Exception
	 *             when one of the abligatory fields is not full
	 */
	public void build() throws Exception;

}
