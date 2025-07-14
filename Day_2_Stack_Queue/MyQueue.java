package Day_2_Stack_Queue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()) throw new RuntimeException("Queue is empty");
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Main method to test
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); 
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Is Empty? " + queue.isEmpty()); 
    }
}
