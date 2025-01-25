package Conditional2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Check if input satisfies triangle inequality
        if (isValidTriangle(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Invalid Triangle");
        }

        scanner.close();
    }

    // Helper method to check triangle inequality
    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
