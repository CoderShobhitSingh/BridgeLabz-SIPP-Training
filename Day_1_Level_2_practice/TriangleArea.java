package Day_1_Level_2_practice;

import java.util.Scanner;

public class TriangleArea {
    private static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double baseCm = in.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = in.nextDouble();

        double areaCm2  = 0.5 * baseCm * heightCm;
        double areaIn2  = areaCm2 / (CM_PER_INCH * CM_PER_INCH);

        System.out.printf("The Area of the triangle in sq in is %.4f and sq cm is %.4f%n", areaIn2, areaCm2);
    }
}
