package com.sirma.itt.javacourse.builder;

/**
 * 
 * One type of house.
 * 
 * @author Nikolay Ch
 * 
 */
class OneStoryHouse extends HouseBuilder {

	/**
	 * Initializes the features of the house.
	 * 
	 * @param features
	 *            the features
	 */
	public OneStoryHouse(String features) {
		house.setType(this.getClass() + " " + features);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.builder.HouseBuilder#buildFoundation()
	 */
	public void buildFoundation() {
		house.setProgress("foundation is done");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.builder.HouseBuilder#buildFrame()
	 */
	public void buildFrame() {
		house.setProgress("frame is done");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.builder.HouseBuilder#buildExterior()
	 */
	public void buildExterior() {

		house.setProgress("Exterior is done");
	}

	public void buildInterior() {

		house.setProgress("Interior is under going");
	}
}
