package Arrays;

import java.util.Scanner;

public class MaxSumPathArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];

        for(int i=0; i<m; i++) a[i] = sc.nextInt();
        for(int i=0; i<n; i++) b[i] = sc.nextInt();

        System.out.println(maxPathSum(a, b, m, n));
    }

    private static int maxPathSum(int[] a, int[] b, int lenOfA, int lenOfB) {
        int result=0, sum1=0, sum2=0;
        int i=0, j=0;
        while(i<lenOfA && j<lenOfB) {
            if(a[i] < b[j]) sum1 += a[i++]; // Add element of arr1 to sum1
            else if(a[i] > b[j]) sum2 +=b[j++]; // Add element of arr2 to sum2

            // We've met a common point
            else {
                result += Math.max(sum1, sum2);
                sum1 = 0; sum2 = 0;

                int temp=i;
                while(i<lenOfA && a[i] == b[j]) sum1 += a[i++];
                while(j<lenOfB && a[temp] == b[j]) sum2 += a[j++];

                result += Math.max(sum1, sum2);
                sum1=0; sum2=0;
            }
        }

        // Assemble till all arrays are traversed
        while(i<lenOfA) sum1 += a[i++];
        while(j< lenOfB) sum2 += b[j++];

        result += Math.max(sum1, sum2);

        return result;
    }
}
