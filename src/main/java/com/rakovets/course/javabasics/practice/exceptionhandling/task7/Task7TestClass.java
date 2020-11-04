package com.rakovets.course.javabasics.practice.exceptionhandling.task7;

public class Task7TestClass <T> {
    public String getHit(double i) throws NoobException {

        if (i < Math.random()) {
            throw new NoobException("damn boy ...  you're a NOOOOB");
        } else {
            return "good job";
        }
    }
}
