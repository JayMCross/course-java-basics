package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private static StringUtil stringUtil;

    @BeforeAll
    static void init() {
        stringUtil = new StringUtil();
    }

    @Test
    void stringAdditionTest() {
        Assertions.assertEquals("qwerty", stringUtil.stringAddition("qwe", "rty"));
        Assertions.assertEquals("A_a_b_B", stringUtil.stringAddition("A_a", "_b_B"));
        Assertions.assertEquals("qwe r t y", stringUtil.stringAddition("qwe", " r t y"));
        Assertions.assertEquals("a1+b2+c3+e4", stringUtil.stringAddition("a1", "+b2+c3+e4"));
    }

    @Test
    void stringIndexTest() {
        Assertions.assertEquals(13, stringUtil.stringIndex("quickBrownFoxJumpsOverTheLazyDog", "J"));
        Assertions.assertEquals(0, stringUtil.stringIndex("quickBrownFoxJumpsOverTheLazyDog", "q"));
        Assertions.assertEquals(6, stringUtil.stringIndex("quick Brown Fox Jumps Over The Lazy Dog", "B"));
        Assertions.assertEquals(-1, stringUtil.stringIndex("quick Brown Fox Jumps Over The Lazy Dog", "b"));
    }

    @Test
    void ifEqualTest() {
        Assertions.assertEquals(true, stringUtil.ifEqual("qwerty", "qwerty"));
        Assertions.assertEquals(false, stringUtil.ifEqual("QWERTY", "qwerty"));
        Assertions.assertEquals(true, stringUtil.ifEqual("QWERTY", "QWERTY"));
        Assertions.assertEquals(false, stringUtil.ifEqual("QWERTY", "QWE RTY"));
        Assertions.assertEquals(false, stringUtil.ifEqual("QWERTY", "QWE+RTY"));
    }

    @Test
    void trimmedUpperTest() {
        Assertions.assertEquals("ABCDEFG", stringUtil.trimmedUpper(" abcdefg "));
        Assertions.assertEquals("A+B+C+D+E+F=G", stringUtil.trimmedUpper("a+b+c+d+e+f=g "));
        Assertions.assertEquals("A B C D E F G", stringUtil.trimmedUpper(" a b c d e f g "));
    }

    @Test
    void substringFrom10Test() {
        Assertions.assertEquals("asdfghjkl", stringUtil.substringFrom10("qwertyuiopasdfghjkl"));
        Assertions.assertEquals("the string does not have enough characters", stringUtil.substringFrom10("qwertyuio"));
        Assertions.assertEquals("asdfghjklzxcvbnm,qwerty", stringUtil.substringFrom10("qwertyuiopasdfghjklzxcvbnm,qwertyuiop"));
    }

    @Test
    void smileReplacementTest() {
        Assertions.assertEquals(":)", stringUtil.smileReplacement(":("));
        Assertions.assertEquals("1:)1", stringUtil.smileReplacement("1:(1"));
        Assertions.assertEquals(": (", stringUtil.smileReplacement(": ("));
        Assertions.assertEquals("::)(", stringUtil.smileReplacement("::(("));
        Assertions.assertEquals(":):)", stringUtil.smileReplacement(":):)"));
    }

    @Test
    void ifFirstAndFinalTest() {
        Assertions.assertEquals(true, stringUtil.ifFirstAndFinal("still you cannot just lie still", "still"));
        Assertions.assertEquals(true, stringUtil.ifFirstAndFinal("stillyoucannotjustliestill", "still"));
        Assertions.assertEquals(false, stringUtil.ifFirstAndFinal("madam, I'm adam", "adam"));
    }

    @Test
    void ifPalindromeTest() {
        Assertions.assertEquals("is palindrome", stringUtil.ifPalindrome("qwertrewq"));
        Assertions.assertEquals("is palindrome", stringUtil.ifPalindrome("MadamImAdam"));
        Assertions.assertEquals("not palindrome", stringUtil.ifPalindrome("i am not a palindrome!"));
    }

    @Test
    void stringSplittingTest() {
        Assertions.assertEquals(new String[]{"qw", "er", "ty"}, stringUtil.stringSplitting("qwerty", 2));
        Assertions.assertEquals(new String[]{"qw", "er", "ty", "u"}, stringUtil.stringSplitting("qwertyu", 2));
        // я так понимаю здесь проблема со ссылкой , не знаю как это устранить
    }

    @Test
    void howManyWordsTest() {
        Assertions.assertEquals(1, stringUtil.howManyWords("qwerty"));
        Assertions.assertEquals(2, stringUtil.howManyWords("qwe rty"));
        Assertions.assertEquals(2, stringUtil.howManyWords("qw1e r2ty"));
        Assertions.assertEquals(3, stringUtil.howManyWords("qw e r2ty"));
        Assertions.assertEquals(2, stringUtil.howManyWords("qw+e rty"));
        Assertions.assertEquals(2, stringUtil.howManyWords("qw   rty"));


    }
}
