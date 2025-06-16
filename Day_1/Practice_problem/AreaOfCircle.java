package Day_1_Practice_problem;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area = " + area);
        sc.close();
    }
}
