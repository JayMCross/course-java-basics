package com.rakovets.course.javabasics.practice.exceptionhandling;

public class DriverClassTask3 {public static void main(String[] args)
{

    Task3TestClass testThingy = new Task3TestClass();

    try
    {

        String bar = testThingy.getBar(0);// '0' is the only thing falling under exception
    }
    catch (Task3 e)
    {
        // print the stack trace
        e.printStackTrace();
    }
}
}
