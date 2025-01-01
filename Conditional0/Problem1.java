package Talentely.Conditional0;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        scanner.close();

        if (num1 == num2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
