package S4;

import java.util.Scanner;

public class StringisPalindromeorNot {
public static void palindrome(String input) {
	String reverse="";
	for (int i = input.length() - 1; i >= 0; i--) {
        reverse += input.charAt(i);
    }

    if (input.equals(reverse)) {
        System.out.println("String is a Palindrome");
    } else {
        System.out.println("String is not a Palindrome");
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    palindrome(input);
    scanner.close();
}
}