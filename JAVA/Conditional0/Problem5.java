package Talentely.Conditional0;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        scanner.close();
        if (mark >= 35) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}
