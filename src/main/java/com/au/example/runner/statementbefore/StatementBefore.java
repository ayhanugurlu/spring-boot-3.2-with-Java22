package com.au.example.runner.statementbefore;

import com.au.example.runner.ExampleRunner;

public class StatementBefore implements ExampleRunner {

	@Override
	public void run() throws Throwable {
		var value = 42;
		new Child(value);
	}

}
