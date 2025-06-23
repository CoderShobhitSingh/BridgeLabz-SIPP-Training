package Day_5_String;

import java.util.Scanner;

public class StringIndexOut {
    static void generateSIOOBE(String text) {
        System.out.println(text.charAt(text.length())); 
    }
    static void handleSIOOBE(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("Handled SIOOBE: " + sioobe);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        generateSIOOBE(text);
        handleSIOOBE(text);
    }
}
