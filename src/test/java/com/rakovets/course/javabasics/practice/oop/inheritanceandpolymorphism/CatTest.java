package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    Cat standartCat = new Cat("standartCatName");
    Person simpleCatLovingMan = new Person(50);

    @Test
    void catMewTest() {
        Assertions.assertEquals("mew", standartCat.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("purr", standartCat.purr());
    }

    @Test
    void mewTest() {
        standartCat.mew(simpleCatLovingMan);
        Assertions.assertEquals(49, simpleCatLovingMan.getHappiness());
    }

    @Test
    void purrTest() {
        standartCat.purr(simpleCatLovingMan);
        Assertions.assertEquals(51, simpleCatLovingMan.getHappiness());
    }
}
