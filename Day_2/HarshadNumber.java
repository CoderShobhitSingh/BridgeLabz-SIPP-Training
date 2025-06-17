package Day_2;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;
        int tempNumber = number; 
        
        if (number <= 0) {
            System.out.println(number + " is not a positive integer, so not a Harshad Number.");
            scanner.close();
            return;
        }

        while (tempNumber > 0) {
            int digit = tempNumber % 10; 
            sumOfDigits += digit;        
            tempNumber /= 10;            
        }

        
        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
    }
}
