package Looping1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long multiple = scanner.nextLong();
        scanner.close();
        long value;
        long sum = 0;

        for (value = 1; value <= multiple; value++) {
            sum = number + sum;
        }

        System.out.println(sum);
    }

}
