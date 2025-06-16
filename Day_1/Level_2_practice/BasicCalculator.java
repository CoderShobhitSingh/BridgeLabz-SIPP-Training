package Day_1_Level_2_practice;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = in.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = in.nextDouble();

        double add  = number1 + number2;
        double sub  = number1 - number2;
        double mul  = number1 * number2;
        double div  = number1 / number2;   // division by zero will throw Infinity/NaN automatically

        System.out.printf(
            "The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f and %.2f%n",
            number1, number2, add, sub, mul, div
        );
    }
}
