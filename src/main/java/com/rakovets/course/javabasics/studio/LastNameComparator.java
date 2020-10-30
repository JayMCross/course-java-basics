package com.rakovets.course.javabasics.studio;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Actor>{
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return actor1.getLastname().compareTo(actor2.getLastname());
    }
}
