package Looping1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long pow = scanner.nextLong();
        scanner.close();
        long ans = 1;

        for (int ctr = 1; ctr <= pow; ctr++) {
            ans *= num;
        }

        System.out.println(ans);
    }

}
