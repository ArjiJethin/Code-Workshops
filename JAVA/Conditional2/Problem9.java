package Conditional2;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] parts = input.split("/");
        if (parts.length != 3) {
            System.out.println("Invalid date format");
            return;
        }
        int date = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        if (isValidDate(date, month, year)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidDate(int date, int month, int year) {
        if (date > 0 && date < 32 && month > 0 && month < 13 && year > 0 && year < 10000) {
            if (date < 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                return true;
            } else if (date < 32 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                    || month == 12)) {
                return true;
            } else if (month == 2) {
                if ((date < 30 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) || (date < 29)) {
                    return true;
                }
            }
        }
        return false;
    }

}
