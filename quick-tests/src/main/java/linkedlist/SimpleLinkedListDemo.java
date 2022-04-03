package linkedlist;

public class SimpleLinkedListDemo {

    public static void main(String[] args) {

        SimpleLinkedList myList = new SimpleLinkedList();

        myList.add("Hello");
        myList.add("Bye");

        System.out.println(myList.size());
        System.out.println(myList.get(1));
    }
}

class SimpleLinkedList {
    private Node first;      // always points to the first node

    public SimpleLinkedList() {
    }

    public SimpleLinkedList(Node first) {
        this.first = first;
    }

    private static class Node {
        Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "o=" + o +
                    ", next=" + next +
                    '}';
        }
    }

    public void add(Object o) {
        Node node = new Node(o);

        if (first == null) {
            first = node;
        } else {
            append(node);
        }
    }

    private void append(Node node) {
        Node last = first;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
    }

    public int size() {
        int count = 0;
        Node last = first;
        while(last != null) {
            count++;
            last = last.next;
        }
        return count;
    }

    public Object get(int index) {
        int count = 0;
        Node last = first;
        while(count < index) {
            count++;
            last = last.next;
        }
        return last.o;
    }
}