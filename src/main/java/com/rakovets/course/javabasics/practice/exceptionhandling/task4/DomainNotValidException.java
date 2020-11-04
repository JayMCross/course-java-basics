package com.rakovets.course.javabasics.practice.exceptionhandling.task4;

public class DomainNotValidException extends RuntimeException {
    public DomainNotValidException(String message) {
        super(message);
    }
}
