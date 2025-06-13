package Day_1_Practice_problem;

import java.util.Scanner;

public class CelciusToFehrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature in °C: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in °F = " + f);
        sc.close();
    }
}
