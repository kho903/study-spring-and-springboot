package jikim;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {

		System.out.println("===== Print Only Odd Numbers from the List =====");
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printOddNumbersInListFunctional(numbers);

		System.out.println("===== Print All Courses individually =====");
		List<String> courses =
			List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");

		courses.stream()
			.forEach(System.out::println);

		System.out.println("===== Print Courses Containing the word 'Spring' =====");
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);

		System.out.println("===== Print Courses Whose Name has at least 4 letters =====");
		courses.stream()
			.filter(course -> course.length() >= 4)
			.forEach(System.out::println);

		System.out.println("===== Print the cubes of odd numbers =====");
		numbers.stream()
			.filter(number -> number % 2 == 0)
			.map(number -> number * number * number)
			.forEach(System.out::println);

		System.out.println("===== Print the number of characters in each course name =====");
		courses.stream()
			// .map(course -> course.length())
			.map(String::length)
			.forEach(System.out::println);

	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 1)
			.forEach(System.out::println);
	}

}
