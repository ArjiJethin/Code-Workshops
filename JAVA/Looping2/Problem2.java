package Looping2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();
        long two = 1;
        long three = 1;

        for (long num = 1; num <= N; num = num + 2) {
            System.out.print(two + " ");
            two = two * 2;

            if (num + 1 <= N) {
                System.out.print(three + " ");
                three = three * 3;
            }
        }
    }

}
