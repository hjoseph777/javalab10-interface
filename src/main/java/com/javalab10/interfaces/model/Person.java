package com.javalab10.interfaces.model;

import com.javalab10.interfaces.common.Comparable;

public class Person implements Comparable<Double> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Double getComparableValue() {
        // Convert age to double for common comparison
        return (double) age;
    }

    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}
