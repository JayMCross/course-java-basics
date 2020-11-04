package com.rakovets.course.javabasics.practice.exceptionhandling.task4;

public class Client {
    public static void main(String[] args) {
        RegistrationService service = new RegistrationService();
        try {
            service.validateEmail("abc@notValidDomain.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
