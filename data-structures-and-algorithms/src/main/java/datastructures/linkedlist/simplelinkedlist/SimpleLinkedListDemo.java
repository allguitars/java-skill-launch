package datastructures.linkedlist.simplelinkedlist;

public class SimpleLinkedListDemo {

    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.add("A");
        simpleLinkedList.add("B");

        System.out.println("Size: " + simpleLinkedList.size());    // 2
        System.out.println("node 0: " + simpleLinkedList.get(0));  // A
        System.out.println("node 1: " + simpleLinkedList.get(1));  // B
        System.out.println("node 2: " + simpleLinkedList.get(2));  // IndexOutOfBoundsException

    }
}
