package lambda.anonymous_class_demo;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {

        String[] names = {"Dave", "Stanley", "Ian"};

        // ** Original: anonymous class implementation:

        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.length() - name2.length();
            }
        });

        // ** Step 1: separate the Comparator implementation from Arrays.sort()

        // Initialize a Comparator object
        // Because Comparator is an Interface, so we need to implement the required and ONLY
        // method, which is compare().
        Comparator<String> byLength = new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.length() - name2.length();
            }
        };
        Arrays.sort(names, byLength);

        // ** Step 2: use lambda expression

        // With lambda expression, we do not need to write Comparator<String> again on the right-hand side
        // Also, we do not need the return statement.
        Comparator<String> byLength2 = (String name1, String name2) -> {
            return name1.length() - name2.length();
        };
        Arrays.sort(names, byLength2);

        // Step 3: remove 'return'

        // Since there is only one statement, we do not need the curly braces
        // The return keyword also needs to be removed when there are no curly braces
        Comparator<String> byLength3 = (String name1, String name2) -> name1.length() - name2.length();
        Arrays.sort(names, byLength3);

        // ** Step 4: remove obvious type

        // As from the left-hand side we already know that it is to compare strings, so
        // the parameters passed into compare() method have to be of String type.
        // So, we remove the type of the arguments
        Comparator<String> byLength4 = (name1, name2) -> name1.length() - name2.length();
        Arrays.sort(names, byLength4);

        // Step 4: Final version - combine with the anonymous implementation

        // Now, the statement is short enough so we put it back to Arrays.sort() method.
        Arrays.sort(names, (name1, name2) -> name1.length() - name2.length());

        System.out.println(Arrays.toString(names));

        /**
         * From this demo, we can see that the lambda expression can be used for anonymous
         * class implementation where you can implement the interface and create anonymous object
         * at the same time.
         */
    }
}

