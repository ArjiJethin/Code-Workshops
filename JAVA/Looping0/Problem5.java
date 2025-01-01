package Looping0;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        scanner.close();
        long factorial = 1;

        for (long val = 1; val <= num; val++) {
            factorial *= val;
        }

        System.out.println(factorial);
    }
}
