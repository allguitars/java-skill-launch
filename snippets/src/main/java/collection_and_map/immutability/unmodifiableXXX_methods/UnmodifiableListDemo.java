package collection_and_map.immutability.unmodifiableXXX_methods;

// Before JDK8, we can use static methods from Collections, such as
// unmodifiableCollection(), unmodifiableList(), unmodifiableSet(), and unmodifiableMap()
// to get an unmodifiable object.

// After JDK9, we can use of() method to create this kind of objects.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // add() amd remove methods are called side effect methods which are not allowed
        // in functional programming because they can "modify" the list
        names.add("Dave");  // this is allowed when it's modiifiable
        names.add("Stanley");
        System.out.println(names);

        // Get an unmodifiable version of this list to "restrict" operations on the list
        List<String> unmodifiableNames = Collections.unmodifiableList(names);

        // get() method is not a side effect
        System.out.println(unmodifiableNames.get(0));

        // side effect operation will throw an UnsupportedOperationException
        unmodifiableNames.add("John");

        // However, the element is not really immutable
        // If you can access from the original list reference, you can still change the element
        // ** The unmodifiable list's element will also be changed since
        // actually it references to the same list
        names.add("Irene");
        System.out.println(unmodifiableNames); // will have Irene as well: [Dave, Stanley, Irene]
    }
}
