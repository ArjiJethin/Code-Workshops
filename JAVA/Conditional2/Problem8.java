package Conditional2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setLenient(false);
        try {
            @SuppressWarnings("unused")
            Date date = sdf.parse(input);
            int hours = Integer.parseInt(input.split(":")[0]);
            if (hours >= 0 && hours <= 24) {
                System.out.println("Valid");
            } else {
                System.out.println("Not Valid");
            }
        } catch (ParseException | NumberFormatException e) {
            System.out.println("Not Valid");
        }
    }

}
