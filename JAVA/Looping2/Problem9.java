package Looping2;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hr1, min1, sec1, hr2, min2, sec2;
        long time1, time2, diff;
        hr1 = scanner.nextInt();
        min1 = scanner.nextInt();
        sec1 = scanner.nextInt();
        hr2 = scanner.nextInt();
        min2 = scanner.nextInt();
        sec2 = scanner.nextInt();
        scanner.close();
        time1 = hr1 * 3600 + min1 * 60 + sec1;
        time2 = hr2 * 3600 + min2 * 60 + sec2;
        if (time1 > time2) {
            diff = time1 - time2;
        } else {
            diff = time2 - time1;
        }
        System.out.println(diff);
    }

}
