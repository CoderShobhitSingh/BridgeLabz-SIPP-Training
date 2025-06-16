package Day_1_Level_2_practice;

import java.util.Scanner;

public class FeetToYard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = in.nextDouble();

        double yards = feet / 3.0;         // 1 yard = 3 feet
        double miles = yards / 1760.0;     // 1 mile = 1760 yards

        System.out.printf("The distance in yards is %.4f while the distance in miles is %.6f%n", yards, miles);
    }
}
