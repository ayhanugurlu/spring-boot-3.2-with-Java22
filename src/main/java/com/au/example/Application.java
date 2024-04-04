package com.au.example;

import com.au.example.runnable.LanguageDemonstrationRunner;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



	@Bean
	ApplicationRunner example(Map<String, LanguageDemonstrationRunner> examples) {
		return _ -> examples.forEach((_, runner) -> {
			try {
				runner.run();
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		});
	}

}
