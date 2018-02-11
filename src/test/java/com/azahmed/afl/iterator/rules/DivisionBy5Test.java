package com.azahmed.afl.iterator.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DivisionBy5Test {
IteratorRule unitUnderTest; 
	
	@Before
	public void setup() {
		unitUnderTest = new DivisionBy5();
	}
	
	@Test
	public void testApplyRuleSuccess() {
		Integer integerValue = new Integer(10);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to be divisible by 5", integerValue);
		assertTrue(message, condition);
	}

	@Test
	public void testApplyRuleSuccessNegative() {
		Integer integerValue = new Integer(-5);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to be divisible by 5", integerValue);
		assertTrue(message, condition);
	}
	
	@Test
	public void testApplyRuleFail() {
		Integer integerValue = new Integer(1);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to not be divisible by 5", integerValue);
		assertFalse(message, condition);
	}
	
}
