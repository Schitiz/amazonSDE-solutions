package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        rotateArr(arr, d, n);
    }

    private static void rotateArr(int[] arr, int d, int n) {
            int i, j, k, temp;
            int gcd = gcdCalculator(d,n);

            for(i=0; i<gcd; i++) {
                temp = arr[i];
                j = i;
                while(true) {
                    k=j+d;
                    if(k >= n) k -= n;
                    if(k == i) break;
                    arr[j] = arr[k];
                    j=k;
                }
                arr[j] = temp;
            }

        Arrays.stream(arr).forEach(el -> System.out.print(el+" "));
    }

    private static int gcdCalculator(int a, int b) {
        if(b==0) return a;
        else return gcdCalculator(b, a%b);
    }
}
