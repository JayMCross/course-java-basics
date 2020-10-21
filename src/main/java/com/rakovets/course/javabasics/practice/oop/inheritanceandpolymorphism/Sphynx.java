package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mews ( in egyptian )";
    }

    @Override
    public String purr() {
        return "purrs ( in egyptian )";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-15);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(15);
    }
}
