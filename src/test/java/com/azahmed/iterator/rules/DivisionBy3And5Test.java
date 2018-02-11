package com.azahmed.iterator.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.azahmed.iterator.rules.DivisionBy3And5;
import com.azahmed.iterator.rules.IteratorRule;

/**
 * To test {@link DivisionBy3And5}.
 * 
 * @author Asrar
 *
 */
public class DivisionBy3And5Test {
	IteratorRule unitUnderTest; 
	
	@Before
	public void setup() {
		unitUnderTest = new DivisionBy3And5();
	}
	
	@Test
	public void testApplyRuleSuccess() {
		Integer integerValue = new Integer(15);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to be divisible by 3 and 5", integerValue);
		assertTrue(message, condition);
	}

	@Test
	public void testApplyRuleSuccess2() {
		Integer integerValue = new Integer(45);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to be divisible by 3 and 5", integerValue);
		assertTrue(message, condition);
	}
	
	@Test
	public void testApplyRuleSuccess3() {
		Integer integerValue = new Integer(-45);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to be divisible by 3 and 5", integerValue);
		assertTrue(message, condition);
	}
	
	@Test
	public void testApplyRuleFailsCozValueNotDivisibleBy3AndFive() {
		Integer integerValue = new Integer(11);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to not be divisible by 3 and 5", integerValue);
		assertFalse(message, condition);
	}

	@Test
	public void testApplyRuleFailsCozValueDivisibleBy3Only() {
		Integer integerValue = new Integer(3);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to not be divisible by 3 and 5", integerValue);
		assertFalse(message, condition);
	}
	
	@Test
	public void testApplyRuleFailsCozValueDivisibleBy5Only() {
		Integer integerValue = new Integer(5);
		Boolean condition = unitUnderTest.applyRule(integerValue);
		String message = String.format("Expected:%s to not be divisible by 3 and 5", integerValue);
		assertFalse(message, condition);
	}
	
}
