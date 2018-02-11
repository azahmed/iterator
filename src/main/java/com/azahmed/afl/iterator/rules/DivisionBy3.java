package com.azahmed.afl.iterator.rules;

import static com.azahmed.afl.iterator.iterator.IteratorRunner.THREE;

/**
 * 
 * @author Asrar
 *
 */
public class DivisionBy3 implements IteratorRule {
	private static String FOO = "FOO";
	
	public Boolean applyRule(Integer integerValue) {
		if (integerValue.intValue() % THREE == 0) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public void displayMessage(String message) {
		System.out.println(message + FOO);
	}
	
}
