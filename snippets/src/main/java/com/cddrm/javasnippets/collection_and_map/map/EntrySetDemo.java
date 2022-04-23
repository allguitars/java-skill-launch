package com.cddrm.javasnippets.collection_and_map.map;

// Check the following link for com.cddrm.javasnippets.other useful methods provided by Map
// https://openhome.cc/Gossip/CodeData/JDK8/Map.html

import java.util.Map;
import java.util.TreeMap;

public class EntrySetDemo {

    public static void main(String[] args) {
        // You can all entrySet demo to get both keys and values at once
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // entrySet method returns a set of Map.Entry objects
        System.out.println("Calling entrySet method on the com.cddrm.javasnippets.collection_and_map.map");
        map.entrySet().forEach(entry -> {
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        });

        // You can also use the forEach method directly on the com.cddrm.javasnippets.collection_and_map.map
        System.out.println("Calling forEach method directly on the com.cddrm.javasnippets.collection_and_map.map:");
        map.forEach((key, value) -> System.out.println("key: " + key + "; value: " + value));

        // Use custom foreach
        System.out.println("Using enforced for loop:");
        myForEach(map.entrySet());

    }
    static void myForEach(Iterable<Map.Entry<Integer, String>> iterable) {
        for (Map.Entry<Integer, String> entry : iterable) {
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        }
    }
}
