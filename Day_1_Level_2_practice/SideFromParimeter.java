package Day_1_Level_2_practice;

import java.util.*;
public class SideFromParimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = in.nextDouble();

        double side = perimeter / 4.0;
        System.out.printf("The length of the side is %.4f whose perimeter is %.4f%n", side, perimeter);
    }
}
