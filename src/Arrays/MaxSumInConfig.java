package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumInConfig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSum(arr, n);
    }

    private static void maxSum(int[] arr, int n) {
        int totalSum = Arrays.stream(arr).sum();
        int prevSum = 0;

        for(int i = 0; i < n; i++) {
            prevSum += (arr[i]*i);
        }

        int maxSum = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++) {
            prevSum = prevSum + (arr[i-1] * (n-1)) - (totalSum-arr[i]);
            maxSum = Math.max(maxSum, prevSum);
        }

        System.out.println(maxSum);
    }
}
