package Day_2;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Amar:");
        System.out.print("Age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Height (in cm): ");
        double amarHeight = scanner.nextDouble();

        System.out.println("Enter details for Akbar:");
        System.out.print("Age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Height (in cm): ");
        double akbarHeight = scanner.nextDouble();

        System.out.println("Enter details for Anthony:");
        System.out.print("Age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Height (in cm): ");
        double anthonyHeight = scanner.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend += "Amar ";
        }
        if (youngestAge == akbarAge) {
            youngestFriend += "Akbar ";
        }
        if (youngestAge == anthonyAge) {
            youngestFriend += "Anthony";
        }
        System.out.println("\nYoungest friend(s): " + youngestFriend.trim() + " (Age: " + youngestAge + ")");

        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend += "Amar ";
        }
        if (tallestHeight == akbarHeight) {
            tallestFriend += "Akbar ";
        }
        if (tallestHeight == anthonyHeight) {
            tallestFriend += "Anthony";
        }
        System.out.println("Tallest friend(s): " + tallestFriend.trim() + " (Height: " + tallestHeight + " cm)");

    }
}
