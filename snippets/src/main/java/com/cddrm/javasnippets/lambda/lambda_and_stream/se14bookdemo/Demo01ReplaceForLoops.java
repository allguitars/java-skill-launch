package com.cddrm.javasnippets.lambda.lambda_and_stream.se14bookdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Demo01ReplaceForLoops {

    public static void main(String[] args) {

        List<Player> players = List.of(
                new Player("Dave", 25),
                new Player("Stanley", 20),
                new Player("Ian", 30)
        );

        // *** The easily confusing way ***

        // There will be for loops around, and it is also more difficult to understand
        // the inside logic at the first glance.
        List<String> names = new ArrayList<>();

        for (Player player : players) {
            if (player.getAge() > 20) {
                names.add(player.getName().toUpperCase());
            }
        }

        for (String name : names) {
            out.println(name);
        }

        // *** Use stream pipeline ***

        // players is a List, and List is a Collection
        // After JDK8, Collection provides stream() method to return a Stream instance
        players.stream()
                .filter(player -> player.getAge() > 20)   // filter() takes in a Predicate instance
                .map(Player::getName)                     // map() takes in a Function instance, a mapper
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(out::println);
    }
}

class Player {
    private final String name;
    private final Integer age;

    public Player(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}