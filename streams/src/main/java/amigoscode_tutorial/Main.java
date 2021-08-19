package amigoscode_tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach ❌
//        List<Person> females = new ArrayList<>();
//
//        for (Person person : people) {
//            if (person.getGender().equals(Gender.FEMALE)) {
//                females.add(person);
//            }
//        }
//
//        females.forEach(System.out::println);

        // Declarative approach ✅

        /** Filter
         *  A filter takes in a Predicate that gives a condition of what we want and returns true or false
         *  We collect the results coming back from the filer into a list, which will give us a brand new list
         */
//        List<Person> females = people.stream()
//                .filter(person -> person.getGender().equals(Gender.FEMALE))
//                .collect(Collectors.toList());
//
//        females.forEach(System.out::println);

        /** Sort
         *  sorted() takes in a comparator, and we tell it what to compare
         */
        // 1. Normal
//        List<Person> sorted = people.stream()
//                .sorted(Comparator.comparing(Person::getAge))
//                .collect(Collectors.toList());
//
//        sorted.forEach(System.out::println);

        // 2. Reversed
//        List<Person> sorted = people.stream()
//                .sorted(Comparator.comparing(Person::getAge).reversed())
//                .collect(Collectors.toList());
//
//        sorted.forEach(System.out::println);

        // 3. Chain comparators
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getGender).thenComparing(Person::getAge))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        // We can also ask questions about our collections...

        // * All match
        // * Any match
        // * None match
        // * Max
        // * Min
        // * Group

    }

    private static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}
