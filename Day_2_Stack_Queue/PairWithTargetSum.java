package Day_2_Stack_Queue;

import java.util.*;

public class PairWithTargetSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair found: " + num + " + " + (target - num) + " = " + target);
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean found = hasPairWithSum(arr, target);
        if (!found) {
            System.out.println("No pair found with the given sum.");
        }

        sc.close();
    }
}
