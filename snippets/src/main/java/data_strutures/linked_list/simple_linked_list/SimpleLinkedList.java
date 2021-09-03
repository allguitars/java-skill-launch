package data_strutures.linked_list.simple_linked_list;

public class SimpleLinkedList {
    private class Node {
        Object o;
        Node next;

        Node(Object o) {
            this.o = o;
        }
    }

    private Node first;

    public void add(Object newElem) {
        Node newNode = new Node(newElem);

        if (first == null) {
            first = newNode;
        } else {
            append(newNode);
        }
    }

    public void append(Node node) {
        Node last = first;

        // last should reference the tail node
        while (last.next != null) {
            last = last.next;
        }

        // now last should be referencing the tail node
        last.next = node;
    }

    public int size() {
        int count = 1;
        Node last = first;
        while (last.next != null) {
            last = last.next;
            count++;
        }
        return count;
    }

    public Object get(int index) {
        checkSize(index);
        return findElementOf(index);
    }

    public void checkSize(int index) throws IndexOutOfBoundsException {
        int size = size();
        if (index >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Index: %d, Size: $d", index, size));
        }
    }

    public Object findElementOf(int index) {
        int count = 0;
        Node last = first;
        while (count < index) {
            last = last.next;
            count++;
        }
        return last.o;
    }

}
