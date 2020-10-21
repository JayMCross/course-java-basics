package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat{
    public Persian (String name){
        super(name);
    }

    @Override
    public String mew() {
        return "mews ( in persian )";
    }

    @Override
    public String purr() {
        return "purrs ( in persian )";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-5);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(5);
    }
}
