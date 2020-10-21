package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseCatTest {
    Person normalHumanBeing = new Person(50);
    Siamese coolCat = new Siamese("cool cat name");

    @Test
    void mewTest() {
        Assertions.assertEquals("mews ( in thailand )", coolCat.mew());
    }

    @Test
    void purrTest() {
        Assertions.assertEquals("purrs ( in thailand )", coolCat.purr());
    }

    @Test
    void persianMewEffectTest() {
        coolCat.mew(normalHumanBeing);
        Assertions.assertEquals(40, normalHumanBeing.getHappiness());
    }

    @Test
    void persianPurrEffectTest() {
        coolCat.purr(normalHumanBeing);
        Assertions.assertEquals(60, normalHumanBeing.getHappiness());
    }
}
