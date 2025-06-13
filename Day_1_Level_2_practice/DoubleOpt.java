package Day_1_Level_2_practice;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter double a: ");
        double a = in.nextDouble();
        System.out.print("Enter double b: ");
        double b = in.nextDouble();
        System.out.print("Enter double c: ");
        double c = in.nextDouble();

        double expr1 = a + b * c;
        double expr2 = a * b + c;
        double expr3 = c + a / b;
        double expr4 = a % b + c;   // % works for doubles too

        System.out.printf("The results of Double Operations are %.4f, %.4f, %.4f and %.4f%n",
                          expr1, expr2, expr3, expr4);
    }
}
