package com.rakovets.course.javabasics.StringCollectionUtil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringCollectionUtil {
    public static List<String> resetWordsByLength(LinkedList originClc, int wordSize) {
        Iterator<String> iterator = originClc.iterator();
        LinkedList<String> resultClc = new LinkedList<String>();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (temp.length() == wordSize) {
                resultClc.add("*");
            } else resultClc.add(temp);
        }
        return resultClc;
    }

    public static List<String> removeWordsByLength(LinkedList originClc, int wordSize) {
        Iterator<String> iterator = originClc.iterator();
        LinkedList<String> resultClc = new LinkedList<String>();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (temp.length() != wordSize) {
                resultClc.add(temp);
            }
        }
        return resultClc;
    }
}
