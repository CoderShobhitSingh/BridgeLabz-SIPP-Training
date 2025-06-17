package Day_2;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userInput;

        System.out.println("Enter numbers to sum. Enter 0 to finish.");

        while (true) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextDouble()) {
                userInput = scanner.nextDouble();
                if (userInput == 0) {
                    break; 
                }
                total += userInput;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }

        System.out.println("The total sum is: " + total);
    }
    
}
