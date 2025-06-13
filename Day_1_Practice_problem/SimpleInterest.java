package Day_1_Practice_problem;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate (% per annum): ");
        double r = sc.nextDouble();
        System.out.print("Time (years): ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
        sc.close();
    }
}
