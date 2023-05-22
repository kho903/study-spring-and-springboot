package com.jikim.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor, equals, hashcode
// and toString are automatically created.
// Released in JDK 16.
record Person(String name, int age) { }

record Address(String firstLine, String city) { }

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Jihun";
	}

	@Bean
	public int age() {
		return 28;
	}

	@Bean
	public Person person() {
		return new Person("Kim", 20);
	}

	@Bean
	public Address address() {
		return new Address("Baker Street", "London");
	}
}
