package com.techreturners.exercise002;

public class Person {

    private String firstName;
    private String lastName;
    private String from;
    private int age;

    public Person(String firstName, String lastName, String from, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.from = from;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFrom() {
        return from;
    }

    public int getAge() {
        return age;
    }
}
