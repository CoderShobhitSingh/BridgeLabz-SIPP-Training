package Day_2;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            System.out.println("Odd and Even numbers from 1 to " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
    }
}
