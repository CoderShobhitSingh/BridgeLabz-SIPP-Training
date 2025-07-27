package Day_4_SearchingAlgorithms;

import java.util.*;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));  // Output: progamin
    }
}

