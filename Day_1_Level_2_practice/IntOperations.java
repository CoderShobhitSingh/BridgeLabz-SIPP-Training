package Day_1_Level_2_practice;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        int a = in.nextInt();
        System.out.print("Enter integer b: ");
        int b = in.nextInt();
        System.out.print("Enter integer c: ");
        int c = in.nextInt();

        int expr1 = a + b * c;     // * before +
        int expr2 = a * b + c;     // * before +
        int expr3 = c + a / b;     // / before +
        int expr4 = a % b + c;     // % before +

        System.out.printf("The results of Int Operations are %d, %d, %d and %d%n",
                          expr1, expr2, expr3, expr4);
    }
}
