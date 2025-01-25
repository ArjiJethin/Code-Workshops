package Conditional0;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        scanner.close();
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

}
