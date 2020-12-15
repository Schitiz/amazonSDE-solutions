package Arrays;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int n = 5; //sc.nextInt();
        int[] arr = {2, 4, 1, 3, 5};
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
        System.out.println(thirdLargest(arr, n));
    }

    private static int thirdLargest(int[] arr, int n) {
        if(arr.length > 3) {
            int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
            for(int i=1; i<n; i++) {
                if(arr[i] > first) {
                    third= second;
                    second = first;
                    first=arr[i];
                }
                else if(arr[i] > second) {
                    third = second;
                    second=arr[i];
                }
                else if(arr[i]> third) {
                    third = arr[i];
                }
            }
            return third;
        }
        return -1;
    }
}
