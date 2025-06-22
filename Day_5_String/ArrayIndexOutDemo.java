package Day_5_String;

import java.util.Scanner;

public class ArrayIndexOutDemo {
    static void generateException(String[] names) {
        System.out.println("Off-by-one access: " + names[names.length]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println("Safe access: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Caught specifically: " + aioobe);
        } catch (RuntimeException re) {            // Generic fallback
            System.out.println("Caught generic runtime ex: " + re);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names? ");
        int n = sc.nextInt(); sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        generateException(names);   
        handleException(names);
        sc.close();
    }
}
