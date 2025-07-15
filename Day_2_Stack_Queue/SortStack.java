package Day_2_Stack_Queue;

import java.util.Stack;

public class SortStack {

    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sort(stack);
            insertInSortedOrder(stack, top);
        }
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertInSortedOrder(stack, value);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);

        System.out.println("Original Stack: " + stack);
        sort(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

