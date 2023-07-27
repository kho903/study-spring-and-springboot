package jikim;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
	}

	/*private static void print(int number) {
		System.out.println(number);
	}*/

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// [12, 9, 13, 4, 6, 2, 4, 12, 15]
		// 12
		// 9
		// 13
		// ....

		// What to do?
		// numbers.stream()
		// 	.forEach(FP01Functional::print); // Method Reference
		numbers.stream()
			.forEach(System.out::println);

		// How to loop the numbers?
		// for (int number : numbers) {
		// 	System.out.println(number);
		// }
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			// Filter - Only Allow Even Numbers
			.filter(FP01Functional::isEven)
			.forEach(System.out::println);
	}
}
