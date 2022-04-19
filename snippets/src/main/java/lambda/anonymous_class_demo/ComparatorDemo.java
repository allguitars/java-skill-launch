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

        Comparator<String> byLength = new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.length() - name2.length();
            }
        };

        Arrays.sort(names, byLength);

        // ** Step 2: use lambda expression

        Comparator<String> byLength2 =
                (String name1, String name2) -> name1.length() - name2.length();

        Arrays.sort(names, byLength2);

        // ** Step 3:

        Comparator<String> byLength3 =
                (name1, name2) -> name1.length() - name2.length();

        Arrays.sort(names, byLength3);

        // Step 4: Final version - combine with the anonymous implementation

        Arrays.sort(names,
                (name1, name2) -> name1.length() - name2.length());

        System.out.println(Arrays.toString(names));
    }
}

