package Day_2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;
        int tempNumber = number;
        int numberOfDigits = 0;

        
        if (tempNumber == 0) {
            numberOfDigits = 1;
        } else {
            int countTemp = Math.abs(tempNumber);
            while (countTemp > 0) {
                countTemp /= 10;
                numberOfDigits++;
            }
        }

        tempNumber = originalNumber; 

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
           
            sum += Math.pow(digit, numberOfDigits);
            tempNumber /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is Not an Armstrong Number.");
        }
    }
}
