package collections.comparator;

// You can use Collections.sort to sort a list of Strings, but if you want to change the
// sorting behavior, you can define your own comparator by implementing the
// Comparator interface and override the compare() method

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparatorDemo {

    public static void main(String[] args) {
        List words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");

        // Default sorting
        Collections.sort(words);
        System.out.println(words); // [A, B, F, M, O, W, X]

        // To override the sorting way, pass in your custom comparator as the second argument
        Collections.sort(words, new StringComparator());
        System.out.println(words); // [X, W, O, M, F, B, A]

        // Lambda expression:
        // And because we need to implement ONLY one method for the Comparator interface, which is
        // the compare() method, we can use lambda expression to implement it on the go
        Collections.sort(words, (String s1, String s2) -> -s1.compareTo(s2));
        System.out.println(words); // [X, W, O, M, F, B, A]
    }
}

class StringComparator implements Comparator<String> {

    // String is already a Comparable, so you can call the compareTo() method
    // and change the returned results
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);  // reverse the default sorting result
    }
}
