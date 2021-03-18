package application;

import queue.Queue;
import stack.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: LinkedList implementation


        // Stack testing
        System.out.println("---STACK---");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int poppedStack = stack.pop();
        System.out.println("Popped: " + poppedStack);
        int peekingStack = stack.peek();
        System.out.println("Top: " + peekingStack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Elements:\n" + stack.toString());

        // Queue testing
        System.out.println("---QUEUE---");
        Queue queue = new Queue();
        queue.push(8);
        queue.push(6);
        queue.push(2002);
        queue.push(19);
        int poppedQueue = queue.pop();
        System.out.println("Popped: " + poppedQueue);
        int peekingQueue = queue.peek();
        System.out.println("First element: " + peekingQueue);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Elements: " + queue.toString());
    }
}
