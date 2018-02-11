package com.azahmed.afl.iterator.rules;

import static com.azahmed.afl.iterator.iterator.IteratorRunner.FIVE;

/**
 * 
 * @author Asrar
 *
 */
public class DivisionBy5 implements IteratorRule {
	private static String BAR = "BAR";
	
	public Boolean applyRule(Integer integerValue) {
		if (integerValue.intValue() % FIVE == 0) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public void displayMessage(String message) {
		System.out.println(message + BAR);
	}
	
}
