package Looping1;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        scanner.close();

        for (long num = 1; num <= input; num++) {
            if (num % 4 == 0) {
                continue;
            }
            System.out.print(num + " ");
        }
    }

}
