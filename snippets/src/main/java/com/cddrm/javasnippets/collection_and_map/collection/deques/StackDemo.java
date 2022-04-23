package com.cddrm.javasnippets.collection_and_map.collection.deques;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {
    private Deque elems = new ArrayDeque(); // ArrayDeque implements Deque interface
    private int capacity;

    // constructor
    public StackDemo(int capacity) {
        this.capacity = capacity;
    }

    // main
    public static void main(String[] args) {
        StackDemo stack = new StackDemo(3);
        stack.push("Dave");
        stack.push("Stanley");
        stack.push("John");

        System.out.println(stack.pop());  // John
        System.out.println(stack.pop());  // Stanley
        System.out.println(stack.pop());  // Dave
        System.out.println(stack.peek()); // null
    }

    public boolean push(Object elem) {
        if (isFull()) {
            return false;
        }
        return elems.offerLast(elem);
    }

    public boolean isFull() {
        return elems.size() + 1 > capacity;
    }

    public Object pop() {
        return elems.pollLast();
    }

    public Object peek() {
        return elems.peekLast();
    }
}
