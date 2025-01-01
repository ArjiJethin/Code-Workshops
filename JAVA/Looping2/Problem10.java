package Looping2;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dd, mm, yy, nod = 0, year, itr, dd1, mm1, yy1;

        dd = scanner.nextInt();
        mm = scanner.nextInt();
        yy = scanner.nextInt();

        dd1 = scanner.nextInt();
        mm1 = scanner.nextInt();
        yy1 = scanner.nextInt();
        scanner.close();

        if (yy <= yy1 && mm <= 12 && mm1 <= 12 && dd <= 31 && dd1 <= 31) {
            for (year = yy + 1; year < yy1; year++) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    nod += 366;
                else
                    nod += 365;
            }

            if (yy != yy1) {
                for (itr = mm; itr <= 12; itr++) {
                    switch (itr) {
                        case 12:
                            nod += 31;
                            break;
                        case 11:
                            nod += 30;
                            break;
                        case 10:
                            nod += 31;
                            break;
                        case 9:
                            nod += 30;
                            break;
                        case 8:
                            nod += 31;
                            break;
                        case 7:
                            nod += 31;
                            break;
                        case 6:
                            nod += 30;
                            break;
                        case 5:
                            nod += 31;
                            break;
                        case 4:
                            nod += 30;
                            break;
                        case 3:
                            nod += 31;
                            break;
                        case 2:
                            if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0)
                                nod += 29;
                            else
                                nod += 28;
                            break;
                        case 1:
                            nod += 31;
                            break;
                    }
                }
            }

            for (itr = 1; itr < mm1; itr++) {
                switch (itr) {
                    case 12:
                        nod += 31;
                        break;
                    case 11:
                        nod += 30;
                        break;
                    case 10:
                        nod += 31;
                        break;
                    case 9:
                        nod += 30;
                        break;
                    case 8:
                        nod += 31;
                        break;
                    case 7:
                        nod += 31;
                        break;
                    case 6:
                        nod += 30;
                        break;
                    case 5:
                        nod += 31;
                        break;
                    case 4:
                        nod += 30;
                        break;
                    case 3:
                        nod += 31;
                        break;
                    case 2:
                        if (yy1 % 4 == 0 && yy1 % 100 != 0 || yy1 % 400 == 0)
                            nod += 29;
                        else
                            nod += 28;
                        break;
                    case 1:
                        nod += 31;
                        break;
                }
            }

            nod += dd1 - dd;
            System.out.println(nod);
        } else {
            System.out.println("Invalid");
        }
    }

}
