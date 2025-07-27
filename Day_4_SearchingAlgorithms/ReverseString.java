package Day_4_SearchingAlgorithms;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String userInput = scanner.nextLine();
        
        String reversed = reverse(userInput);
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
}

