package Looping1;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        long num1 = 1, num2 = 1;

        if (N >= 1)
            System.out.print(num1 + " ");
        if (N >= 2)
            System.out.print(num2 + " ");

        for (int itr = 3; itr <= N; itr++) {
            long num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }

}
