package Looping0;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long start = scanner.nextLong();
        long end = scanner.nextLong();
        long itr;

        if (start % 2 == 0) {
            itr = start;
        } else {
            itr = start + 1;
        }

        while (itr <= end) {
            System.out.print(itr + " ");
            itr += 2;
        }

        scanner.close();
    }
}
