package Day_2;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }

            sum += num;
        }

        System.out.println("The sum of entered numbers is: " + sum);
    }
}
