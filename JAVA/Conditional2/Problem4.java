package Conditional2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        scanner.close();
        if (num1 > num2 && num1 > num3) {
            System.out.printf("Maximum is %d", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("Maximum is %d", num2);
        } else {
            System.out.printf("Maximum is %d", num3);
        }
    }

}
