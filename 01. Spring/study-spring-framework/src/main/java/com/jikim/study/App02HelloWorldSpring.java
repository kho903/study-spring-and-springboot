package com.jikim.study;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// 1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2. Configure the things that we want Spring to manage - @Configuration
		// HelloWorldConfiguration - @Configuration
		// name - @Bean

		// 3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("customAddress"));

		// multiple bean 일 경우 예외 발생. -> @Primary 로 해결
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));

		// System.out.println
		// Arrays.stream(context.getBeanDefinitionNames())
		// 	.forEach(System.out::println);

		System.out.println(context.getBean("person5Qualifier"));
	}
}
