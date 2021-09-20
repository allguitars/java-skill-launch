package collection_and_map.map;

// Keys in a TreeMap has an order, so the condition for an object
// to be a key in a TreeMap is to implement the Comparable interface.
// In this example, the type of the key is String, and String already implements
// the Comparable interface, so when we print out the TreeMap, it will arrange
// the result according to the key string.

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap<>();
        messages.put("Dave", "Hi there!");
        messages.put("Stanley", "Nice to meet you");
        messages.put("John", "Have a nice day");
        System.out.println(messages);  // There is no specific order for items in a HashMap
        // Dave -> John -> Stanley

        // As String already implements the Comparable interface's compareTo method, we cannot
        // override the way how it decides the order.
        // However, we can pass in a Comparator object into the TreeMap's constructor
        // to tell TreeMap how to make order for the String keys
        Map<String, String> messages2 = new TreeMap<>(new StringComparator());
        messages2.put("Dave", "Hi there!");
        messages2.put("Stanley", "Nice to meet you");
        messages2.put("John", "Have a nice day");
        System.out.println(messages2);
        // Stanley -> John -> Dave

        // And because Comparator interface only has one method to implement, we
        // can use the Lambda expression to implement the method while creating the instance.
        Map<String, String> messages3 = new TreeMap<>(
                (s1, s2) -> -s1.compareTo(s2)  // This is a Comparator object
        );
        messages3.put("Dave", "Hi there!");
        messages3.put("Stanley", "Nice to meet you");
        messages3.put("John", "Have a nice day");
        System.out.println(messages3);
        // Stanley -> John -> Dave
    }
}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}