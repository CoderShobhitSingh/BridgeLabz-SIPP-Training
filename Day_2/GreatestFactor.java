package Day_2;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("No greatest factor beside itself for " + number);
        } else {
            int greatestFactor = 1;
            int counter = number - 1; 

            while (counter >= 1) { 
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; 
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        }
    }
}
