package arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int i, temp;
        for (i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
