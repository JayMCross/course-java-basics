package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time min = new Time(0,0,60);
        Time astroDay = new Time(23, 59 , 54);
        System.out.println(min.getTotalSeconds());
        System.out.println(astroDay.getTotalSeconds());

    }
}
