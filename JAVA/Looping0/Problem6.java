package Looping0;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        scanner.close();
        int flag = 0;

        if (num % 2 == 1) {
            System.out.println("NO");
        } else {
            while (num > 2) {
                num /= 2;
                if (num % 2 == 1) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
