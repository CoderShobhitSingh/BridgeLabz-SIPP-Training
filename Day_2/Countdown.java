package Day_2;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number for the countdown: ");
        int counter = scanner.nextInt();

        if (counter < 1) {
            System.out.println("Please enter a positive number for countdown.");
        } else {
            System.out.println("Initiating Rocket Launch Countdown:");
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Lift-off!");
        }
    }
    
}
