package Looping2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        scanner.close();
        long zero = 0;

        while (num > 0) {
            zero += num / 5;
            num /= 5;
        }

        System.out.println(zero);
    }

}
