package com.cddrm.javasnippets.generic.solution.using_hashmap;

import java.util.HashMap;

public class MyClass<T, V> {
    T ob;
    V ob2;

    // Java Generics is useful for the hashmap
    HashMap<T, V> map = new HashMap<>();

    public MyClass(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    public void showType() {
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());

    }
}