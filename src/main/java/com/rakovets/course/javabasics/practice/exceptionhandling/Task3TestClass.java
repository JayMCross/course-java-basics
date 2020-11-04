package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task3TestClass {
    public String getBar(int i) throws Task3 {
        if (i == 0) {
            throw new Task3("Anything but zero ...");
        } else {
            return "Thanks";
        }
    }
}
