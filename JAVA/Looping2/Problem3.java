package Looping2;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();
        for (long number = 1; number <= N; number++) {
            if (number % 2 == 0) {
                System.out.print((number / 2) - 1 + " ");
            } else {
                System.out.print(number - 1 + " ");
            }
        }
    }

}
