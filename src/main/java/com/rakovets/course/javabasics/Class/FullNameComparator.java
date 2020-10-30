package com.rakovets.course.javabasics.Class;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else {
            return result;
        }
    }
}
