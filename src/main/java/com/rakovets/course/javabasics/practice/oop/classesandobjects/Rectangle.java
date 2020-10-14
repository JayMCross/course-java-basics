package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {

    private Point topLeftPoint;
    private Point bottomRightPoint;

    Rectangle(Point p1, Point p2) {
        this.topLeftPoint = p1;
        this.bottomRightPoint = p2;
    }

    public double getPerimeter() {
        double xLength = Math.abs(topLeftPoint.getX() - bottomRightPoint.getX());
        double yLength = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
        double prmtr = (xLength + yLength) * 2;
        return prmtr;
    }

    public double getSpace() {
        double xLength = Math.abs(topLeftPoint.getX() - bottomRightPoint.getX());
        double yLength = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
        double space = xLength * yLength;
        return space;
    }

    public void setFirstPoint(Point first) {
        this.topLeftPoint = first;

    }

    public void setSecondPoint(Point second) {
        this.bottomRightPoint = second;

    }

    public Point getFirstPoint() {
        return this.topLeftPoint;
    }

    public Point getSecondPoints() {
        return this.bottomRightPoint;
    }


}
