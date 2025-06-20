package Day_2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; 
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded (years of service not more than 5).");
        }
    }
}
