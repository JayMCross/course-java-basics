package com.rakovets.course.javabasics.studio;

import java.util.Comparator;

public class FeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor obj1, Actor obj2) {
        int comparedByFee = obj1.getFee() - obj2.getFee();
        if (comparedByFee == 0) {
            return obj1.getLastname().compareTo(obj2.getLastname());
        } else {
            return comparedByFee;
        }
    }
}
