package S4;

import java.util.Scanner;

public class SwaptwonumwithoutTemp {
public static void swap(int n,int m) {
	n=n^m;
	m=n^m;
	n=n^m;
	System.out.println("After swapping:");
    System.out.println("n = " + n);
    System.out.println("m = " + m);
}
public static void main(String arg[]) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt(),m=scanner.nextInt();
	swap(n, m);
	scanner.close();
}
}
