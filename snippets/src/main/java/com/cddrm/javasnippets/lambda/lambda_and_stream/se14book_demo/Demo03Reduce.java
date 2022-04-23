package com.cddrm.javasnippets.lambda.lambda_and_stream.se14book_demo;

import java.util.List;

import static java.lang.System.out;

public class Demo03Reduce {

    public static void main(String[] args) {

        List<Employee2> employees = List.of(
                new Employee2("Dave", 26, Gender2.MALE),
                new Employee2("Justin", 39, Gender2.MALE),
                new Employee2("Monica", 36, Gender2.FEMALE),
                new Employee2("Irene", 6, Gender2.FEMALE)
        );

        int sum = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.MALE)
                .mapToInt(Employee2::getAge)
                .reduce((total, age) -> total + age) // if the initial value is not specified, then the first element will be used
                .getAsInt();

        long maleCount = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.MALE)
                .count();

        double average = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.MALE)
                .mapToDouble(Employee2::getAge)
                .reduce((total, age) -> total + age)
                .getAsDouble() / maleCount;

        int maxAge = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.FEMALE)
                .mapToInt(Employee2::getAge)
                .reduce(0, (currentMax, age) -> age > currentMax ? age : currentMax);  // 0 will be used as currentMax for the first round

        List.of(sum, average, maxAge).forEach(out::println);
    }
}

enum Gender2 {MALE, FEMALE}

class Employee2 {
    private String name;
    private Integer age;
    private Gender2 gender;

    public Employee2(String name, Integer age, Gender2 gender) {
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

    public Gender2 getGender() {
        return gender;
    }
}