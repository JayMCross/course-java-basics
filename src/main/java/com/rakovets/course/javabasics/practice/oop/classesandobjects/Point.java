package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point2) {
        int xLength = point2.x - this.x;
        int yLength = point2.y - this.y;
        double space = Math.sqrt(xLength ^ 2 + yLength ^ 2);
        return space;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

