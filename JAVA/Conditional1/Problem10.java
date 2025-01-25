package Conditional1;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s1 = scanner.nextLong();
        long s2 = scanner.nextLong();
        long s3 = scanner.nextLong();
        scanner.close();
        if ((s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }

}
