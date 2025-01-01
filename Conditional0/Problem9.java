package Talentely.Conditional0;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of steps
        System.out.print("Enter the count of steps: ");
        int steps = scanner.nextInt();

        // Input for direction
        System.out.print("Enter the direction (left or right): ");
        String direction = scanner.next().toLowerCase();
        scanner.close();

        // Initialize the starting position
        int position = 0;

        // Calculate the new position based on direction
        if (direction.equals("right")) {
            position += steps;
        } else if (direction.equals("left")) {
            position -= steps;
        } else {
            System.out.println("Invalid direction! Please enter 'left' or 'right'.");
            return;
        }

        // Output the final position
        System.out.println("The final position is: " + position);

        scanner.close();
    }

}
