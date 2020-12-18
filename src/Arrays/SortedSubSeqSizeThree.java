package Arrays;

import java.util.Scanner;

public class SortedSubSeqSizeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        find3Numbers(arr, n);
    }

    private static void find3Numbers(int[] arr, int n) {
        int left=arr[0], mid = Integer.MIN_VALUE;
        int seq = 1;
        boolean isSequence = false;

        for(int i = 1; i < n; i++) {

            if(arr[i] < left) {
                left = arr[i];
            }

            else if(arr[i] > left) {
                seq ++;
                if(seq == 3) {
                    isSequence = true;
                    System.out.println("1");
                    return;
                }
                mid = arr[i];
            }

            else if(arr[i] < mid) {
                mid = arr[i];
            }

        }

        System.out.println("-1");
    }
}
