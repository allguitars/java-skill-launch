package collections.comparator;

// Since JDK8, Comparator has new built-in static method to save our time.
// We do not need to define these comparing rules by ourselves.

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;

public class ComparatorAPIsDemo {

    public static void main(String[] args) {
        // Now we have a more complex list
        // We want to sort it with more rules, such as putting nulls in the front
        List words = Arrays.asList("B", "X", "A", "M", null, "F", "W", "O", null);

        words.sort(nullsFirst(reverseOrder()));
        System.out.println(words);
    }
}


