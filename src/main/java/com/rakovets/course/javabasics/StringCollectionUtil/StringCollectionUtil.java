package com.rakovets.course.javabasics.StringCollectionUtil;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public static List resetWordsByLength(Collection<String> originClc, int wordSize) {
        Collection<String> copyOfOriginClc = new LinkedList<>(originClc);
        ListIterator<String> iterator = ((LinkedList<String>) copyOfOriginClc).listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordSize) {
                iterator.set("*");
            }
        }
        return (List) copyOfOriginClc;
    }

    public static List removeWordsByLength(Collection<String> originClc, int wordSize) {
        Collection<String> copyOfOriginClc = new LinkedList<>(originClc);
        ListIterator<String> iterator = ((LinkedList<String>) copyOfOriginClc).listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordSize) {
                iterator.remove();
            }
        }
        return (List) copyOfOriginClc;
    }
}
