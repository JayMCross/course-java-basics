package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(18,19);
        Point p2 = new Point(2,5);
        Point p3 = new Point(1,1);
        Point p4 = new Point(-4,-6);
        System.out.println(p1.distance(p2));
        System.out.println(p3.distance(p4));

    }
}
