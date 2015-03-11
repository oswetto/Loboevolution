/*
 * (c) COPYRIGHT 1999 World Wide Web Consortium
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 *
 * $Id: CombinatorCondition.java 477010 2006-11-20 02:54:38Z mrglavas $
 */
package org.w3c.css.sac;


/**
 * The Interface CombinatorCondition.
 *
 * @author Philippe Le Hegaret
 * @version $Revision: 477010 $
 * @see Condition#SAC_AND_CONDITION
 * @see Condition#SAC_OR_CONDITION
 */
public interface CombinatorCondition extends Condition {

	/**
	 * Returns the first condition.
	 *
	 * @return the first condition
	 */
	public Condition getFirstCondition();

	/**
	 * Returns the second condition.
	 *
	 * @return the second condition
	 */
	public Condition getSecondCondition();
}
