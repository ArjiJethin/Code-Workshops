package Conditional1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long day = scanner.nextLong();
        scanner.close();
        if (day >= 0 && day <= 6) {
            switch ((int) day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
            }
        } else {
            System.out.println("Invalid");
        }
    }

}
