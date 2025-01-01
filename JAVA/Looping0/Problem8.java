package Looping0;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int max, min, sum = 0, val;
        double avg, count = 0;

        val = scanner.nextInt();
        max = val;
        min = val;

        while (val != -1) {
            sum += val;

            if (max < val) {
                max = val;
            }

            if (min > val) {
                min = val;
            }

            count++;
            val = scanner.nextInt();
        }

        avg = sum / count;

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.6f%n", avg);
    }

}
