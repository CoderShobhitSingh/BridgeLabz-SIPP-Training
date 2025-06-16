package Day_1_Level_2_practice;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dividend (integer): ");
        int number1 = in.nextInt();
        System.out.print("Enter divisor (integer): ");
        int number2 = in.nextInt();

        int quotient  = number1 / number2;   // integer division
        int remainder = number1 % number2;

        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n",
                          quotient, remainder, number1, number2);
    }
}
