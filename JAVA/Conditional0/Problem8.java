package Conditional0;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        scanner.close();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("HIHELLO");
        } else if (num % 3 == 0) {
            System.out.println("HI");
        } else if (num % 5 == 0) {
            System.out.println("HELLO");
        } else {
            System.out.println("NONE");
        }
    }

}
