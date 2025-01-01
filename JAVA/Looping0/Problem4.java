package Looping0;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long sum = 0;

        for (long itr = 1; itr <= num; itr++) {
            if (itr % 3 == 0 || itr % 5 == 0) {
                sum += itr;
            }
        }

        System.out.print(sum);

        scanner.close();
    }
}
