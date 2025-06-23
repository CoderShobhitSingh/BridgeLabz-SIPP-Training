package Day_5_String;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArray {
    static char[] manualToCharArray(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) result[i] = s.charAt(i);
        return result;
    }

    static boolean equalCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.next();
        char[] builtIn = input.toCharArray();
        char[] userDef = manualToCharArray(input);
        System.out.println("Built-in : " + Arrays.toString(builtIn));
        System.out.println("Manual   : " + Arrays.toString(userDef));
        System.out.println("Equal?   : " + equalCharArrays(builtIn, userDef));
    }
}
