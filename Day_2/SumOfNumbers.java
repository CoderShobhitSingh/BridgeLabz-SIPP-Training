package Day_2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number (must be positive).");
        } else {
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            System.out.println("Sum using for loop: " + sumForLoop);

            long sumFormula = (long) n * (n + 1) / 2; // Cast to long to prevent overflow for large n
            System.out.println("Sum using formula: " + sumFormula);

            if (sumForLoop == sumFormula) {
                System.out.println("Both computations were correct!");
            } else {
                System.out.println("There was a discrepancy in computations.");
            }
        }
    }
}
