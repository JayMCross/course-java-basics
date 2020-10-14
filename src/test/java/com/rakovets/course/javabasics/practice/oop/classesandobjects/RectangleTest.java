package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point point1 = new Point(6, 18);
        Point point2 = new Point(20, 2);
        Rectangle result = new Rectangle(point1, point2);
        System.out.println("space = "+ result.getSpace() + " perimeter = "+ result.getPerimeter());
    }
}
