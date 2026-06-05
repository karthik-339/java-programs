package arrays;

import java.util.Scanner;

public class maxSubarrSum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        int curr = 0, max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            curr += arr[i];
            if (curr > max) {
                max = curr;
            }
            if (curr <= 0) {
                curr = 0;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
