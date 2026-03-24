package S4;

import java.util.Scanner;

public class FactorialofanumberusingRecursion {
public static int factorial(int n) {
	if (n == 0 || n == 1)
        return 1;
    return n * factorial(n - 1);
}
public static void main(String arg[]) {
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int fact=factorial(n);
	scanner.close();
	System.out.print(+ fact);
}
}
