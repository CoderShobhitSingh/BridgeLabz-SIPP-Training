package Day_2_Stack_Queue;

import java.util.*;

public class SlidingWindowMax {
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove out of window elements
            while (!deque.isEmpty() && deque.peek() <= i - k)
                deque.poll();

            // Remove smaller elements in k range
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();

            deque.offer(i);

            // Add to result after first k elements
            if (i >= k - 1)
                result.add(nums[deque.peek()]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<Integer> maxValues = maxSlidingWindow(nums, k);
        
        System.out.println("Max values in sliding window: " + maxValues);
    }
}

