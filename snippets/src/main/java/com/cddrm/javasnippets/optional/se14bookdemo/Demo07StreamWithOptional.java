package com.cddrm.javasnippets.optional.se14bookdemo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.lang.System.out;

// JDK9 之後, 可以用 Stream.ofNullable() 簡化程式
public class Demo07StreamWithOptional {

    public static void main(String[] args) {

        // mock data - order with customer
        Order order1 = new Order(
                new Customer("Dave", List.of("aaa@mail.com", "bbb@mail.com")),
                "Book");

        // mock data - order without customer
        Order order2 = new Order("T-shirt");

        // *** 1. 未使用 Optional

        var customer = order1.getCustomer();

        Stream<String> emails = customer == null ?
                Stream.empty() :
                customer.getEmails().stream();

        emails.forEach(out::println);

        // *** 2. 所可能接收到 null 則可以用 Optional.of 去包

        // 從這邊可以看到 getCustomer 呼叫者也可以利用 Optional.of() 在不知道
        // 回傳結果是否為 null 時，直接去包，也就是假設確定會有回傳值，並且在 map() 中去指定對該回傳值的操作。
        // 由於回傳結果也可能是 null，故要用 orElse() 處理此一情況，否則會編譯錯誤。

        Stream<String> emails2 =
                Optional.of(order1.getCustomer())
                        .map(c -> c.getEmails().stream())
                        .orElse(Stream.empty());

        emails2.forEach(out::println);

        // *** 3. 直接使用 Stream.ofNullable()

        // 其隱含意思為，若接受到 null，則會呼叫 Stream.empty()，
        // 否則使用 Stream.of() 建立內含單一元素的實例。

        Stream<String> emails3 =
                Stream.ofNullable(order2.getCustomer())   // call Steam.empty() implicitly
                        .flatMap(c -> c.getEmails().stream());

        emails3.forEach(out::println);
    }


}

class Customer {
    String name;
    List<String> emails;

    public Customer(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }
}

class Order {
    Customer customer;
    String item;

    // an order with customer
    public Order(Customer customer, String item) {
        this.customer = customer;
        this.item = item;
    }

    // an order without customer
    public Order(String item) {
        this.item = item;
    }

    public Customer getCustomer() {
        return customer;
    }
}