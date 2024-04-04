package com.au.example.runner.statementbefore;

public class Child extends AbstractParent {

	private static int validate(int value) {
		System.out.println(STR."Validating value: \{value}");
		if (value < 0) {
			throw new IllegalArgumentException("Value must be greater than 0");
		}
		return value;
	}

	public Child(int value) {
		super(validate(value));
	}

}
