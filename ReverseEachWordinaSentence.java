package S4;

import java.util.Scanner;

public class ReverseEachWordinaSentence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			String reversedWord = new StringBuilder(word).reverse().toString();
			result.append(reversedWord).append(" ");
		}
		System.out.println(result.toString().trim());

		scanner.close();
	}
}
