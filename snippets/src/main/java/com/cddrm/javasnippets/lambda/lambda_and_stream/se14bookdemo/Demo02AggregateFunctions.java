package com.cddrm.javasnippets.lambda.lambda_and_stream.se14bookdemo;

import java.util.List;

import static java.lang.System.out;

public class Demo02AggregateFunctions {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Dave", 25, Gender.MALE),
                new Employee("Justin", 39, Gender.MALE),
                new Employee("Monica", 36, Gender.FEMALE),
                new Employee("Irene", 6, Gender.FEMALE)
        );

        // sum()
        int sum = employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                // mapToInt() takes in a ToIntFunction instance, a mapper
                // Here want to map an Employee instance into an Integer, which is the same purpose of getAge() method
                // So, we provide the reference of getAge() for overriding applyAsInt() method from ToIntFunction interface
                .mapToInt(Employee::getAge)
                .sum();

        // average()
        double average = employees.stream()
                .filter(employee -> employee.getGender() == Gender.FEMALE)
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble();

        // max()
        int max = employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .mapToInt(Employee::getAge)
                .max()
                .getAsInt();

        List.of(sum, average, max).forEach(out::println);
    }
}

enum Gender {MALE, FEMALE}

class Employee {
    private String name;
    private Integer age;
    private Gender gender;

    public Employee(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}