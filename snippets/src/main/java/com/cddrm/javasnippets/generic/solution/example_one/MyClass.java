package com.cddrm.javasnippets.generic.solution.example_one;

public class MyClass<T> {
    T ob;

    public MyClass(T ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println(ob.getClass().getName());
    }
}
