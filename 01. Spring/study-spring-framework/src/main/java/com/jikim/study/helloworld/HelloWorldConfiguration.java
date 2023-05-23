package com.jikim.study.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor, equals, hashcode
// and toString are automatically created.
// Released in JDK 16.
record Person(String name, int age, Address address) { }

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
	@Primary
	public Person person() {
		return new Person("Kim", 20, new Address("Main Street", "Utrecht"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name, age
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address2) { // name, age, customAddress
		return new Person(name, age, address2); // name, age
	}

	@Bean
	public Person person4Parameters(String name, int age, Address address) { // name, age, customAddress
		return new Person(name, age, address); // name, age
	}

	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address2Qualifier") Address address) {
		return new Person(name, age, address); // name, age
	}

	@Bean(name = "customAddress")
	@Primary
	public Address address() {
		return new Address("Baker Street", "London");
	}

	@Bean(name = "address2")
	@Qualifier("address2Qualifier")
	public Address address2() {
		return new Address("Street", "Suwon");
	}
}
