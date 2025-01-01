package Looping2;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        scanner.close();
        int x = 0, y = 0;
        int multiply = 1;

        while (true) {
            if (steps > 0) {
                x = x + multiply * 10;
                multiply++;
                steps--;
            }
            if (steps > 0) {
                y = y - multiply * 10;
                multiply++;
                steps--;
            }
            if (steps > 0) {
                x = x - multiply * 10;
                multiply++;
                steps--;
            }
            if (steps > 0) {
                y = y + multiply * 10;
                multiply++;
                steps--;
            }
            if (steps == 0) {
                break;
            }
        }

        System.out.printf("(%d, %d)", x, y);
    }

}
