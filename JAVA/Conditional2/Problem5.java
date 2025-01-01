package Conditional2;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        long n2 = scanner.nextLong();
        long n3 = scanner.nextLong();
        long n4 = scanner.nextLong();
        scanner.close();
        long max = (n1 > n2 ? n1 : n2) > (n3 > n4 ? n3 : n4) ? (n1 > n2 ? n1 : n2) : (n3 > n4 ? n3 : n4);

        System.out.printf("Largest is %d", max);
    }

}
