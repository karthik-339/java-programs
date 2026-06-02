package arrays;

import java.util.Scanner;

public class buyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (i = 0; i < n; i++) {
            if (buy < arr[i]) {
                int profit = arr[i] - buy;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buy = arr[i];
            }
        }
        System.out.println(maxprofit);
        sc.close();
    }
}
