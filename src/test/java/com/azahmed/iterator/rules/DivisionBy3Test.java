package com.azahmed.iterator.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.azahmed.iterator.rules.DivisionBy3;
import com.azahmed.iterator.rules.IteratorRule;

/**
 * To test {@link DivisionBy3}.
 * 
 * @author Asrar
 *
 */
public class DivisionBy3Test {
	IteratorRule unitUnderTest; 
	
	@Before
	public void setup() {
		unitUnderTest = new DivisionBy3();
	}
	
	@Test
	public void testApplyRuleSuccess() {
		Integer integerValue = new Integer(15);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to be divisible by 3", integerValue);
		assertTrue(message, condition);
	}

	@Test
	public void testApplyRuleSuccessNegative() {
		Integer integerValue = new Integer(-3);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to be divisible by 3", integerValue);
		assertTrue(message, condition);
	}
	
	@Test
	public void testApplyRuleFail() {
		Integer integerValue = new Integer(1);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to not be divisible by 3", integerValue);
		assertFalse(message, condition);
	}
	

}
