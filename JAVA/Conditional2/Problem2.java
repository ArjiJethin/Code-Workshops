package Conditional2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        scanner.close();
        if ((angle1 + angle2 + angle3 == 180) && angle1 != 0 && angle2 != 0 && angle3 != 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }

}
