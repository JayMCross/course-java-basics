package com.rakovets.course.challenge.oop.classes;

public class PointTests {
    public static void main(String[] args) {
        Point a = new Point(4.3, 6.5);
        a.display();
        System.out.printf("x: %.2f, y: %.2f\n", a.getX(), a.getY());
        a.setX(0.0);
        a.setY(0.0);
        a.display();

        Point b = new Point(0.0, 5.0);
        b.display();
        System.out.println("Distance: " + a.distance(b));
    }
}
