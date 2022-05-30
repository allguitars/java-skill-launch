package com.cddrm.javasnippets.collection_and_map.collection.deques;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Java has built-in Stack class, see:
 * https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
 *
 * However, a more complete and consistent set of LIFO stack operations
 * is provided by the `Deque` interface and its implementations,
 * which should be used in preference to this class.
 */

public class StackDemo {

    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push("Dave");
        stack.push("Stanley");
        stack.push("John");

        System.out.println(stack.pop());  // John
        System.out.println(stack.pop());  // Stanley
        System.out.println(stack.pop());  // Dave
        System.out.println(stack.peek()); // null
    }
}

class MyStack {
    private Deque elems = new ArrayDeque(); // ArrayDeque implements Deque interface
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
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