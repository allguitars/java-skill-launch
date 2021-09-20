package collection_and_map.immutability.unmodifiableXXX_methods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();

        // put methods are side effect methods
        names.put(1, "Dave" );
        names.put(2, "Stanley");
        System.out.println(names);

        // Get an unmodifiable version of the collection_and_map.map
        Map<Integer, String> unmodifiableNames = Collections.unmodifiableMap(names);

        // Now side effect methods are not allowed.
        unmodifiableNames.put(3, "John");       // java.lang.UnsupportedOperationException

        // But actually it is still referencing to the same collection_and_map.map
        names.put(4, "Irene");
        System.out.println(unmodifiableNames);  // Will also have Irene

    }
}
