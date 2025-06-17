package Day_2;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the exponent (power): ");
        int power = scanner.nextInt();

        long result = 1; 
        int counter = 0;

        if (power < 0) {
            System.out.println("Exponent must be a non-negative integer.");
        } else if (power == 0) {
            System.out.println(number + " raised to the power of " + power + " is: 1");
        } else {
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
    }
}
