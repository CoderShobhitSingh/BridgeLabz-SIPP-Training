package Day_2;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms (kg): ");
        double weightKg = scanner.nextDouble();

        System.out.print("Enter height in centimeters (cm): ");
        double heightCm = scanner.nextDouble();

        double heightMeters = heightCm / 100.0;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }
    }
}
