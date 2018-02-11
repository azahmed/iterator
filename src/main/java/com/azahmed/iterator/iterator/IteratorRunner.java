package com.azahmed.iterator.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.azahmed.iterator.rules.DivisionBy3;
import com.azahmed.iterator.rules.DivisionBy3And5;
import com.azahmed.iterator.rules.DivisionBy5;
import com.azahmed.iterator.rules.IteratorRule;

public class IteratorRunner {

	static List<IteratorRule> rules = new ArrayList<IteratorRule>();
	public static int THREE = 3;
	public static int FIVE = 5;
	
	public static void main(final String[] args) {
		initializeRules();
		Scanner scanner = null;
		try {
			System.out.println("Enter number to check rules for");
			scanner = new Scanner(System.in);
			final int number = scanner.nextInt();
			for (int i = 0; i <= number; i++) {
				applyRules(i);
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	/**
	 * What rules to apply:
	 * Div by 3, Div by 5, both
	 * First come first serve i.e. the first rule is applied first.
	 * 
	 */
	private static void initializeRules() {
		IteratorRule rule = new DivisionBy3And5();
		rules.add(rule);
		
		rule = new DivisionBy3();
		rules.add(rule);
		
		rule = new DivisionBy5();
		rules.add(rule);
	}
	
	/**
	 * Loop over each rule n apply.
	 * Only applies the FIRST SUCCESSFUL rule, bails on the rest
	 * 
	 * @param intValue
	 */
	private static void applyRules(int intValue) {
		for (IteratorRule rule : rules) {
			if (rule.applyRule(intValue)) {
				rule.displayMessage(intValue + ":");
				break;
			}
		}
		
	}

}
