package Arrays;

import java.util.Scanner;

public class MinIndexDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(minDist(arr, n, x, y));
    }

    private static int minDist(int[] arr, int n, int x, int y) {
        int first=2*n, second=2*n, minDistance = n;
        for(int i=0; i <n; i++) {
            if(arr[i] == x) {
                first = i;
                minDistance = Math.min(minDistance, Math.abs(first - second));
            }
            if(arr[i] == y) {
                second = i;
                minDistance = Math.min(minDistance, Math.abs(first - second));
            }
        }

        return minDistance == n ? -1 : minDistance;
    }
}
