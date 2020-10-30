package com.rakovets.course.javabasics.studio;

import java.util.Comparator;

public class LastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor obj1, Actor obj2) {
        int comparedByLN = obj1.getLastname().compareTo(obj2.getLastname());
        if (comparedByLN == 0) {
            return obj1.getAge() - obj2.getAge();
        } else {
            return comparedByLN;
        }
    }
}
