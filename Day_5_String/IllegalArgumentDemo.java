package Day_5_String;

import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateIAE(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handleIAE(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException iae) {
            System.out.println("Handled IAE: " + iae);
        } catch (RuntimeException re) {
            System.out.println("Generic runtime ex: " + re);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        generateIAE(text);
        handleIAE(text);
    }
}
