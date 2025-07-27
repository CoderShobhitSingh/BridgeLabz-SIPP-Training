package Day_2_Stack_Queue;

import java.util.*;

public class ZeroSumSubarrays {

    private static void printSubarray(int[] arr, int start, int end) {
        System.out.print("Subarray found from index " + start + " to " + end + ": ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                printSubarray(arr, 0, i);
            }

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    printSubarray(arr, start + 1, i);
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        sc.close();
    }
}
