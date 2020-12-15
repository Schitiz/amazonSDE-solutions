package Arrays;

import java.util.Scanner;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(convertFive(n));
    }

    private static int convertFive(int n) {
        int answer = 0;
        int power = 1;

        while(n != 0) {
            int rem = n % 10;
            answer += (rem == 0) ? 5 * power : rem * power;
            power *= 10;
            n /= 10;
        }

        return  answer;
    }
}
