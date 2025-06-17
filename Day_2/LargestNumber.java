package Day_2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter number 3: ");
        double number3 = scanner.nextDouble();

        boolean isFirstLargest = (number1 >= number2 && number1 >= number3);
        System.out.println("Is the first number the largest? " + isFirstLargest);

        boolean isSecondLargest = (number2 >= number1 && number2 >= number3);
        System.out.println("Is the second number the largest? " + isSecondLargest);

        boolean isThirdLargest = (number3 >= number1 && number3 >= number2);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
    
}
