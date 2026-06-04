package arrays;

import java.util.Scanner;

public class maxSubarrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        if (n == 0) {
            System.out.println(0);
        }
        int i, j;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pre[] = new int[n];
        pre[0] = arr[0];
        for (i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            int start = i;
            for (j = i; j < n; j++) {
                int end = j;
                int curr = start == 0 ? pre[end] : pre[end] - pre[start - 1];
                if (curr > max) {
                    max = curr;
                }
            }
        }
        System.out.print(max);
        sc.close();
    }
}
