package com.cddrm.javasnippets.generic.generics_static_method;

// TODO: Find another good example for methods working with Generics

public class GenericsMethodDemo {

    public static void main(String[] args) {

        Object[] objects1 = {"Dave", "Stanley", "John"};
        System.out.println(Utils.elementOf(objects1, 0));

        // 2.
        Object[] objects2 = {10, 20, 30};
        System.out.println(Utils.elementOf(objects2, 1));
    }
}

class Utils {
    public static <T> T elementOf(T[] objects, int index) {
        return objects[index];
    }
}
