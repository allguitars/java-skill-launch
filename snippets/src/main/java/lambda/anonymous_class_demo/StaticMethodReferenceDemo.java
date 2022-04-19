package lambda.anonymous_class_demo;

import java.util.Arrays;
import java.util.Comparator;

public class StaticMethodReferenceDemo {

    public static void main(String[] args) {

        String[] names = {"Dave", "Stanley", "Ian", "John"};

        // First, we implement a StringOrder class that has multiple implementation of comparison
        // and use it with the anonymous class
        // the byLenth() method here is to provide an implementation to override the
        // compare() method of the Comparator interface
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return StringOrder.byLength(name1, name2);
            }
        });

        // then, we re-write the statement with lambda expression3
        Arrays.sort(names, (name1, name2) -> StringOrder.byLength(name1, name2));

        // from above example, we can see that right-hand side shows that we use byLength() as the
        // implementation for overriding the compare() method of the Comparator interface

        // Java knows that you want to override the compare() method here even you don't write it explicitly
        // because compare() is the only method that you need to implement for Comparator interface

        // if the signature of byLength() matches that of compare(), why not we just put only the name
        // of byLength to tell it to use this method for the implementation?
        // this is where the method reference comes into place
        Arrays.sort(names, StringOrder::byLength);

        // The second argument of Arrays.sort() should be a Comparator object, but you just have to
        // tell it how to implement the only method from Comparator interface, which is compare().

        // ** Java automatically takes the parameters of compare() method and pass them into
        // the byLength() method

        System.out.println(Arrays.toString(names));

        // use another implementation
        Arrays.sort(names, StringOrder::byLexicography);
        System.out.println(Arrays.toString(names));
    }
}

class StringOrder {
    public static int byLength(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static int byLexicography(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static int byLexicographyIgnoreCase(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}
