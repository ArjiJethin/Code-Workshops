package Conditional1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        scanner.close();
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("LOWERCASE");
        } else if (letter >= 'A' && letter <= 'Z') {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("NONE");
        }
    }

}
