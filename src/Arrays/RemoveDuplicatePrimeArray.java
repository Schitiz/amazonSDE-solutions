package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatePrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicate(arr, n);
    }

    private static void removeDuplicate(int[] arr, int n) {
        int product = arr[0];
        int pointerIndex = 1;

        for(int i = 1; i < n; i++) {
            if(product % arr[i] != 0) {
                arr[pointerIndex++] = arr[i];
                product *= arr[i];
            }
        }

        Arrays.stream(arr).forEach(el -> System.out.print(el + " "));
    }
}
