package Looping0;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        scanner.close();
        long itr, oddNum = 1;
        long sum = 0;

        for (itr = 1; itr <= num; itr += 1) {
            sum += oddNum;
            oddNum += 2;
        }

        System.out.print(sum);

    }

}
