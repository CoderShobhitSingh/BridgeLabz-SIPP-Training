package Day_2_Stack_Queue;

import java.util.*;

public class TwoSumIndices {

    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }

        return new int[] { -1, -1 }; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int[] result = findTwoSum(arr, target);
        if (result[0] != -1) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found with the given sum.");
        }

        sc.close();
    }
}

