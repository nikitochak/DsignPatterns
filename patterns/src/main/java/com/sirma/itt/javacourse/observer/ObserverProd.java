package com.sirma.itt.javacourse.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * The observer which looks for changes in the Observable classes.
 * 
 * @author Nikolay Ch
 * 
 */
public class ObserverProd implements Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		System.out.println(arg);
		if (o.getClass().getName() == Unavailable.class.getName()) {
			Available available = (Available) Available.makeInstance();
			available.add(arg, 10);
		} else {
			Unavailable unavailable = (Unavailable) Unavailable.makeInstance();
			unavailable.add(arg, 0);

		}

	}

}
