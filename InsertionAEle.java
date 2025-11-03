package S4.Arrays;

import java.util.Scanner;

public class InsertionAEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n + 1]; // Increase size by 1 to accommodate new element
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int pos = scanner.nextInt();
        int ele = scanner.nextInt();
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position");
        } else {
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = ele;
            n++; // Increase the size of the array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }

}
