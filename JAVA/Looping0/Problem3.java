package Looping0;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long sum = 0;
        long st = scanner.nextLong();
        long end = scanner.nextLong();

        for (long value = st; value <= end; value += 1) {
            if (value % 2 == 0) {
                sum = value + sum;
            }
        }

        System.out.print(sum);

        scanner.close();
    }
}
