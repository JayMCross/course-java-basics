package com.rakovets.course.javabasics.studio;

public class Actor {
    private String firstname;
    private String lastname;
    private int fee;
    private int age;


    public Actor(String firstname, String lastname, int fee, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
