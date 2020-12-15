package Arrays;

import java.util.Scanner;

public class MaxAndSecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            System.out.println();
            largestAndSecondLargest(arr, n);
        }
    }

    private static void largestAndSecondLargest(int[] arr, int n) {
        int first = arr[0], second = Integer.MIN_VALUE;
        for(int i=1; i<n; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if(first == second) second = -1;

        System.out.println(first + ", " + second);
    }
}
