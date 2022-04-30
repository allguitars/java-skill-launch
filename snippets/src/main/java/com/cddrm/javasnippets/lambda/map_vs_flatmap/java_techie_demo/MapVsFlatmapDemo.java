package com.cddrm.javasnippets.lambda.map_vs_flatmap.java_techie_demo;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatmapDemo {

    public static void main(String[] args) {

        List<Customer> customers = MockDatabase.getAll();

        /**
         * 1. using map() for email
         * List<Customer> converted to List<String> -> called data transformation
         * mapping: customer -> customer.getEmail()
         * one customer has one email address -> called one-to-one mapping
         */
        // List
        List<String> emails = customers.stream()
                .map(Customer::getEmail)
                .collect(Collectors.toList());

        System.out.println(emails);

        // what if we want to get the phone numbers for each customer?
        // each customer has more than one phone numbers
        List<List<String>> numbers = customers.stream()
                .map(Customer::getPhoneNumbers)
                .collect(Collectors.toList());

        System.out.println(numbers);

        // from above code, we see there is a List of List, but we want a flat structure
        // the second line from the map() we get a Stream<List<String>>
        // customer -> customer.getPhoneNumbers() returns a List
        // one customer has more than one phone number -> one-to-many mapping

        // how do we flatten it?

        // use flatMap() to convert Stream<List<String>> into Stream<String>
        List<String> phoneNumbersFlatten = customers.stream()
                .map(Customer::getPhoneNumbers)
                .flatMap(phoneNumbers -> phoneNumbers.stream())
                .collect(Collectors.toList());

        System.out.println(phoneNumbersFlatten);
    }
}
