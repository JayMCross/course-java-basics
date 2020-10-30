package com.rakovets.course.javabasics.studio;

import java.util.Comparator;

public class AgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o2.getAge() - o1.getAge();
    }
}
