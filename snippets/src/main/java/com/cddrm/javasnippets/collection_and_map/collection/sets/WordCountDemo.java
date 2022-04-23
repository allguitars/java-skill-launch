package com.cddrm.javasnippets.collection_and_map.collection.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCountDemo {

    public static void main(String[] args) {
        String line = "This is a dog that is a cat where is the student";

        Set words = parseTokens(line);
        System.out.printf("There are %d unique words in this line, and they are\n", words.size());
        words.forEach(word -> System.out.println(word));
    }

    static Set parseTokens(String line) {
        String[] tokens = line.split(" ");

        // asList method acts as bridge between array-based and com.cddrm.javasnippets.collection_and_map.collection-based APIs,
        // in combination with Collection.toArray().
        // HashSet constructor takes a com.cddrm.javasnippets.collection_and_map.collection, and List is a kind of Collection, so it
        // can be passed into the HashSet as a parameter.
        return new HashSet(Arrays.asList(tokens));
    }
}

// Result:
//There are 9 unique words in this line, and they are
//        a
//        student
//        is
//        the
//        that
//        cat
//        This
//        where
//        dog