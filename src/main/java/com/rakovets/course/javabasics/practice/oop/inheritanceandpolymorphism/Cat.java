package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    String name;



    public String mew() {
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public void mew(Person person) {
        person.changeHappiness(-1);
    }

    public void purr(Person person) {
        person.changeHappiness(1);
    }

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
}
