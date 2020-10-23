package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    Cat standardCat = new Cat("standardCatName");
    Person simpleCatLovingMan = new Person(50);

    @Test
    void catMewTest() {
        Assertions.assertEquals("mew", standardCat.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("purr", standardCat.purr());
    }

    @Test
    void mewTest() {
        standardCat.mew(simpleCatLovingMan);
        Assertions.assertEquals(49, simpleCatLovingMan.getHappiness());
    }

    @Test
    void purrTest() {
        standardCat.purr(simpleCatLovingMan);
        Assertions.assertEquals(51, simpleCatLovingMan.getHappiness());
    }
}
