package Talentely.Conditional1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        double ans;
        if (num <= 10000) {
            ans = num + (num * 0.2 + num * 0.8);
        } else if (num <= 20000) {
            ans = num + (num * 0.25) + (num * 0.9);
        } else {
            ans = num + (num * 0.3) + (num * 0.95);
        }

        System.out.printf("Rs.%.2f", ans);
    }

}
