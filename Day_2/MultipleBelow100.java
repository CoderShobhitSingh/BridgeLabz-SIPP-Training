package Day_2;

import java.util.Scanner;

public class MultipleBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (less than 100): ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.print("Multiples of " + number + " below 100 are: ");
            boolean foundAny = false;
            for (int i = 99; i >= 1; i--) { 
                if (i % number == 0) {
                    System.out.print(i + " ");
                    foundAny = true;
                }
            }
            if (!foundAny) {
                System.out.print("None");
            }
            System.out.println();
        }
        scanner.close();
    }
}
