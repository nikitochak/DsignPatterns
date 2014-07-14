package com.sirma.itt.javacourse.builder;

/**
 * Another house type.
 * 
 * @author Nikolay Ch
 * 
 */
public class TwoStoryHouse extends HouseBuilder {

	/**
	 * Sets the type of the house.
	 * 
	 * @param features
	 *            its features
	 */
	public TwoStoryHouse(String features) {
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

		house.setProgress("frame is under construction");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.builder.HouseBuilder#buildExterior()
	 */
	public void buildExterior() {
		house.setProgress("Exterior is waiting to start");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.builder.HouseBuilder#buildInterior()
	 */
	public void buildInterior() {
		house.setProgress("Interior is not started yet");
	}

}
