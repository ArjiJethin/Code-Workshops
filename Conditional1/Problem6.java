package Talentely.Conditional1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();
        if (ch >= '0' && ch <= '9') {
            System.out.println("NUMBER");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("ALPHABET");
        } else {
            System.out.println("SPECIAL CHARACTER");
        }
    }

}
