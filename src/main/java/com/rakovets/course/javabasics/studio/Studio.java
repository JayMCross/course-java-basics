package com.rakovets.course.javabasics.studio;

import java.util.LinkedList;

public class Studio {
    private LinkedList<Actor> actors;

    public Studio(LinkedList<Actor> actors) {
        this.actors = actors;
    }
    public void fire(LinkedList<Actor> actors) {
        actors.sort(new FeeComparator());
        actors.remove(actors.getLast());
    }
}
