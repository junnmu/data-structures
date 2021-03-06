package application;

import binarysearch.BinarySearch;
import linkedlist.LinkedList;
import queue.Queue;
import stack.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
        // LinkedList testing
        System.out.println("---LINKED LIST---");
        LinkedList linkedList = new LinkedList();
        linkedList.append(18);
        linkedList.append(3);
        linkedList.append(21);
        System.out.println("List size: " + linkedList.size());
        System.out.println("Getting item: " + linkedList.getItem(0));
        System.out.println("Index search: " + linkedList.index(21));
        linkedList.setItem(0, 155);
        System.out.println(linkedList.removeElement(155));
        System.out.println("Elements: " + linkedList.toString());

        // Stack testing
        System.out.println("\n---STACK---");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Elements:\n" + stack.toString());

        // Queue testing
        System.out.println("---QUEUE---");
        Queue queue = new Queue();
        queue.push(8);
        queue.push(6);
        queue.push(2002);
        queue.push(19);
        System.out.println("Popped: " + queue.pop());
        System.out.println("First element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Elements: " + queue.toString());
         */

        // Recursive binary search algorithm testing
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 25, 38, 45, 66, 88, 90));
        System.out.println("Index: " + binarySearch.looping(list, 10, 0, list.size()));
        System.out.println("Index: " + binarySearch.recursive(list, 10, 0, list.size()));
    }
}
