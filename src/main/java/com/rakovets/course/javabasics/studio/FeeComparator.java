package com.rakovets.course.javabasics.studio;

import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        Integer p1 = ((Actor) o1).getFee();
        Integer p2 = ((Actor) o2).getFee();

        if (p1 > p2) {
            return 1;
        } else if (p1 < p2) {
            return -1;
        } else {
            return 0;
        }
    }
}
