package Day_2;

import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) { 
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
        }

    }
}
