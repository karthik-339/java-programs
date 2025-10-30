package S4.Arrays;

import java.util.Scanner;

//This is done by swapping method.If we want to do this without swapping then we can use just by printing from last index to first index.
public class ReverseArray {
    public static void reverse(int arr[], int n) {
        int i, temp;
        for (i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        /*
         * for(i=n-1;i>=0;i++){
         * system.out.print(arr[i]+" ");
         * }
         */
        reverse(arr, n);
        scanner.close();
    }
}
