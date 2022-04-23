package com.cddrm.javasnippets.getter_for_getter;

public class GetterForGetter {
    public static void main(String[] args) {

        Bar bar = new Bar("Dave");
        Foo foo = new Foo(bar);   // Foo class uses another class Bar

        // Getter in another getter
        // Happens when an object includes another object
        System.out.println(foo.getBar().getName());
    }
}
