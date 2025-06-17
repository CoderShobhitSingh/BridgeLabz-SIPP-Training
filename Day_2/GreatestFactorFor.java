package Day_2;

import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("No greatest factor beside itself for " + number);
        } else {
            int greatestFactor = 1; 
            for (int i = number - 1; i >= 1; i--) { 
                if (number % i == 0) {
                    greatestFactor = i;
                    break; 
                }
            }
            System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        }
    }
}
