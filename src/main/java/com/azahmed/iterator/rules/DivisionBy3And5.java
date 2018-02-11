package com.azahmed.iterator.rules;

import static com.azahmed.iterator.iterator.IteratorRunner.FIVE;
import static com.azahmed.iterator.iterator.IteratorRunner.THREE;

/**
 * 
 * @author Asrar
 *
 */
public class DivisionBy3And5 implements IteratorRule {
	private static String BAZ = "BAZ";
	
	public Boolean applyRule(Integer integerValue) {
		if (integerValue.intValue() % THREE == 0 && integerValue.intValue() % FIVE == 0) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public void displayMessage(String message) {
		System.out.println(message + BAZ);
	}
	
}
