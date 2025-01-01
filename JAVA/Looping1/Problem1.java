package Looping1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();
        long root;

        for (root = 1; root * root < N; root++)
            ;

        if (root * root == N)
            System.out.println("Perfect Square");
        else
            System.out.println("Not");
    }

}
