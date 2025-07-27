package Day_2_Stack_Queue;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int maxLength = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findLongestConsecutive(arr);
        System.out.println("Length of the longest consecutive sequence: " + result);

        sc.close();
    }
}
