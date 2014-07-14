package com.sirma.itt.javacourse.abstractfactory;

/**
 * The abstract product.
 * 
 * @author Nikolay Ch
 * 
 */
public interface AbstractProduct {

	/**
	 * Sets the title.
	 * 
	 * @param title
	 *            the value
	 */
	public void setTitle(String title);

	/**
	 * Gets the title.
	 * 
	 * @return the value of the title field
	 */
	public String getTitle();

}

/**
 * The first product which implements the abstract product.
 * 
 * @author Nikolay Ch
 * 
 */
class Product1 implements AbstractProduct {

	private String title;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sirma.itt.javacourse.abstractfactory.AbstractProduct#setTitle(java
	 * .lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.abstractfactory.AbstractProduct#getTitle()
	 */
	public String getTitle() {
		return this.title;
	}

}

/**
 * The second product which implements the abstract product.
 * 
 * @author Nikolay Ch
 * 
 */
class Product2 implements AbstractProduct {

	private String title;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sirma.itt.javacourse.abstractfactory.AbstractProduct#setTitle(java
	 * .lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.abstractfactory.AbstractProduct#getTitle()
	 */
	public String getTitle() {
		return this.title;

	}

}