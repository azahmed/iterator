package com.azahmed.iterator.rules;

/**
 * Apply a rule, display a message.
 * 
 * @author Asrar
 *
 */
public interface IteratorRule {
	/**
	 * What rule to apply.
	 * 
	 * @param integerValue
	 * @return
	 */
	Boolean applyRule(Integer integerValue);
	
	/**
	 * What message to display.
	 * 
	 * @param message
	 */
	void displayMessage(String message);
}
