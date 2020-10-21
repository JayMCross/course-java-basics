package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxCatTest {
    Person weirdo = new Person(50);
    Sphynx weirdFurlessCat = new Sphynx("some weird furless name");

    @Test
    void mewTest() {
        Assertions.assertEquals("mews ( in egyptian )", weirdFurlessCat.mew());
    }

    @Test
    void purrTest() {
        Assertions.assertEquals("purrs ( in egyptian )", weirdFurlessCat.purr());
    }

    @Test
    void sphynxMewEffectTest() {
        weirdFurlessCat.mew(weirdo);
        Assertions.assertEquals(35, weirdo.getHappiness());
    }

    @Test
    void sphynxPurrEffectTest() {
        weirdFurlessCat.purr(weirdo);
        Assertions.assertEquals(65, weirdo.getHappiness());
    }
}
