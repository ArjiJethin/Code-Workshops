package Looping2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int var1, var2;

        if (num == 1 || num == 5) {
            System.out.println("Pentagonal Number");
        } else {
            for (var1 = 4, var2 = 5; var2 < num; var1 += 3, var2 += var1)
                ;
            if (var2 == num) {
                System.out.println("Pentagonal Number");
            } else {
                System.out.println("Not a Pentagonal Number");
            }
        }
    }

}
