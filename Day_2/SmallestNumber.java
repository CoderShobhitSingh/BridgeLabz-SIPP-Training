package Day_2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter number 3: ");
        double number3 = scanner.nextDouble();

        boolean isFirstSmallest = (number1 <= number2 && number1 <= number3);

        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
    
}
