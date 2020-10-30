package com.rakovets.course.javabasics.Class;

import java.util.LinkedList;

public class SchoolClass {
    private LinkedList<Student> students;

    public SchoolClass(LinkedList<Student> students) {
        this.students = students;
    }

    public String getBestStudent(LinkedList<Student> students) {
        students.sort(new AvgMarkComparator());
        return students.getLast().toString();
    }
}
