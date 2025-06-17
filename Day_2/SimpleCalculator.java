
package Day_2;

import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second, result;
        String op;

        System.out.print("Enter first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();

        System.out.print("Enter second number: ");
        second = scanner.nextDouble();

        switch (op) {
            case "+":
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = first / second;
                    System.out.println(first + " / " + second + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}