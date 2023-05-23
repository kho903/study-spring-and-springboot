package com.jikim.study.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// MyBusinessClass
// Dependency1
// Dependency2

@Component
class MyBusinessClass {

	Dependency1 dependency1;

	Dependency2 dependency2;

	// @Autowired // 생략 가능
	public MyBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		System.out.println("Constructor Injection - MyBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	@Override
	public String toString() {
		return "MyBusinessClass{" +
			"dependency1=" + dependency1 +
			", dependency2=" + dependency2 +
			'}';
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		try (var context =
				 new AnnotationConfigApplicationContext
					 		(DepInjectionLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

			System.out.println(context.getBean(MyBusinessClass.class));
		}
	}
}
