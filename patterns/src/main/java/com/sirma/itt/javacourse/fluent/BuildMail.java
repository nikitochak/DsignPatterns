package com.sirma.itt.javacourse.fluent;

/**
 * The builder of the mail.
 * 
 * @author Nikolay Ch
 * 
 */
public class BuildMail implements Mail {

	private String to;
	private String from;
	private String subject;
	private String content;
	private String attachments;

	/**
	 * Initializes the components by default.
	 */
	public BuildMail() {
		this.to = null;
		this.from = "Unknown";
		this.subject = "No subject";
		this.content = "No content";

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.fluent.Mail#to(java.lang.String)
	 */
	public Mail to(String to) {
		this.to = to;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.fluent.Mail#from(java.lang.String)
	 */
	public Mail from(String from) {
		this.from = from;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.fluent.Mail#subject(java.lang.String)
	 */
	public Mail subject(String subject) {
		this.subject = subject;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.fluent.Mail#content(java.lang.String)
	 */
	public Mail content(String content) {
		this.content = content;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.fluent.Mail#attachemtns(java.lang.Object[])
	 */
	public Mail attachemtns(Object... objects) {
		if (objects == null) {
			return this;
		} else {
			for (Object ob : objects) {
				this.attachments += ob.toString();
				this.attachments += "\n";
			}
			return this;
		}

	}

	/**
	 * Getter for the to field.
	 */
	public String getTo() {
		return this.to;
	}

	/**
	 * Getter for the from field.
	 */
	public String getFrom() {
		return this.from;
	}

	/**
	 * Getter for the subject field.
	 */
	public String getSubject() {
		return this.subject;
	}

	/**
	 * Getter for the content field.
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * Getter for the attachments field.
	 */
	public String getAttach() {
		return this.attachments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.fluent.Mail#build()
	 */
	public void build() throws Exception {
		if (this.to == null) {
			throw new Exception();
		}

	}
}
