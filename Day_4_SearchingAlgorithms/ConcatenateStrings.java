package Day_4_SearchingAlgorithms;

import java.util.Scanner;

public class ConcatenateStrings {
    public static String concat(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        sb.append(str2);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        String result = concat(str1, str2);
        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}

