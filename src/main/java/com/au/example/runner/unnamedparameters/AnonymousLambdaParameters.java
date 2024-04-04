package com.au.example.runner.unnamedparameters;

import com.au.example.runner.ExampleRunner;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class AnonymousLambdaParameters implements ExampleRunner {

	private final JdbcClient db;

	AnonymousLambdaParameters(DataSource db) {
		this.db = JdbcClient.create(db);
	}

	record Customer(Integer id, String name) {
	}

	@Override
	public void run() throws Throwable {
		var allCustomers = this.db.sql("select * from customer ")
			.query((rs, _) -> new Customer(rs.getInt("id"), rs.getString("name")))
			.list();
		System.out.println("all: " + allCustomers);
	}

}
