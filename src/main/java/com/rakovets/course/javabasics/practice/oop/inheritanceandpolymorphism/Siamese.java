package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mews ( in thailand )";
    }

    @Override
    public String purr() {
        return "purrs ( in thailand )";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(10);

    }
}
