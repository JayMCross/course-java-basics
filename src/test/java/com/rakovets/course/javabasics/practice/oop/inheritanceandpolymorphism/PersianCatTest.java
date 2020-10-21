package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianCatTest {
    Person loverOfPersianCats = new Person(50);
    Persian oneOfPersianCats = new Persian("best name for a persian cat");

    @Test
    void mewTest() {
        Assertions.assertEquals("mews ( in persian )", oneOfPersianCats.mew());
    }

    @Test
    void purrTest() {
        Assertions.assertEquals("purrs ( in persian )", oneOfPersianCats.purr());
    }

    @Test
    void persianMewEffectTest() {
        oneOfPersianCats.mew(loverOfPersianCats);
        Assertions.assertEquals(45, loverOfPersianCats.getHappiness());
    }

    @Test
    void persianPurrEffectTest() {
        oneOfPersianCats.purr(loverOfPersianCats);
        Assertions.assertEquals(55, loverOfPersianCats.getHappiness());
    }
}

