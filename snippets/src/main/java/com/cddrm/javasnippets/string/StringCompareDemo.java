package com.cddrm.javasnippets.string;

public class StringCompareDemo {

    public static void main(String[] args) {

        // Create the variables with String literal syntax
        String a = "Java";
        String b = "C++";
        String c = "Java";

        System.out.println("String literal syntax:");

        System.out.println(a == "Java");  // true, String literals can be compared with '==' operator
        System.out.println(a == b);       // false
        System.out.println(a == c);       // true, even they are different variables

        // Create variables with 'new' operator
        System.out.println("Using the 'new' operator:");

        String d = new String("Java");
        System.out.println(a == d);   // false, String literals and new String should not be compared with '==' operator

        String e = new String("Java");
        System.out.println(d == e);   // false, different objects even they contain the same characters

        // First Summary:
        // 1. equality operator compares references
        // 2. Do not compare com.cddrm.javasnippets.string literal and new com.cddrm.javasnippets.string object with == operator
        // 3. == operator compares two new strings by their references even they carry the same characters
        // 4. So, using == operator to compare strings is ambiguous and prone to mistakes.

        // Right way to compare strings in Java -- use equals() method
        System.out.println("Compare two strings with equals() method:");

        System.out.println(a.equals("Java"));  // true
        System.out.println("Java".equals(a));  // true, call equals() on com.cddrm.javasnippets.string literal to avoid NullPointerException
        System.out.println(a.equals(b));       // false, a and b are both com.cddrm.javasnippets.string literals but have different characters
        System.out.println(a.equals(c));       // true, a anc c are both com.cddrm.javasnippets.string literals with the same characters

        System.out.println("a is a com.cddrm.javasnippets.string literal, and d is a 'new' com.cddrm.javasnippets.string. Both are 'Java':");
        System.out.println(a.equals(d));  // true
        System.out.println("d and e are two different 'new' strings. Both are 'Java':");
        System.out.println(d.equals(e));  // true

        String f = new String("C++");
        System.out.println("e and f are 'new' com.cddrm.javasnippets.string objects with different content:");
        System.out.println(e.equals(f));  // false

        // Second Summary:
        // 1. equals() can be used to compare com.cddrm.javasnippets.string literal and new com.cddrm.javasnippets.string
        // 2. equals() can be used to compare two com.cddrm.javasnippets.string literals and two 'new' strings
        // 3. One should use equals() method to check if two String contains exactly
        //    the same characters in the same order.

        // Finally, why should we call equals on the com.cddrm.javasnippets.string literal or known object?
        // When g is an unknown com.cddrm.javasnippets.string object, or you are not sure if g is null
        String g = null;
        System.out.println("Java".equals(g));   // false
        System.out.println(g.equals("Java"));   // NullPointerException

        // Conclusion:
        // 1. This happens because String class overrides equals() method from Object class, and
        //    this is the reason why behavior of == and equals() method varies in case of String
        //    but remains same in case of Object.
        // 2. == will return true if you compare String literals but return false if you compare
        //    String object to a literal or two String object, even if they have same characters.
    }
}
