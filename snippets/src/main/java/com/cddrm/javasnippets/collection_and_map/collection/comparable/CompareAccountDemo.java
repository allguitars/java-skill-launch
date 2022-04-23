package com.cddrm.javasnippets.collection_and_map.collection.comparable;

// You can easily compare numbers within the list using Collections.sort method, like:
// Example -------------------------------
// List numbers = Arrays.asList(10,3,6,8,7)
// Collections.sort(numbers)
// ---------------------------------------
// However, if you want to compare complex type, such as list of Accounts, then
// you will need to let your complex type implement Comparable and you also
// need to implement the compareTo() method so that it knows how to sort.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareAccountDemo {

    public static void main(String[] args) {
        List accounts = Arrays.asList(
                new Account("Justin", "X1234", 1000),
                new Account("Monica", "X5678", 500),
                new Account("Irene", "X2468", 200)
        );

        Collections.sort(accounts);
        System.out.println(accounts);
    }
}

class Account implements Comparable<Account> {
    private String name;
    private String number;
    private int balance;

    public Account(String name, String number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    // Override this method so Collections.sort knows how to compare when it's sorting
    @Override
    public int compareTo(Account other) {
        return this.balance - other.balance;
    }
}
