package com.inyong.practice1.dto;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public Person() {}

    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", height=" + height + ", weight=" + weight + "}";
    }
}