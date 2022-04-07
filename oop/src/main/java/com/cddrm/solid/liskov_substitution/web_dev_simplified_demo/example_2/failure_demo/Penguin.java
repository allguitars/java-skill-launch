package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_2.failure_demo;

public class Penguin extends Bird {

    @Override
    void fly() {
        throw new RuntimeException("Cannot fly");
    }

    public void swim() {
        System.out.println("I can swim");
    }
}
