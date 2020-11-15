package com.rakovets.course.javabasics.StringCollectionUtil;

import java.util.Arrays;
import java.util.List;

public class StringUtilDemo {
    public static void main(String[] args) {
        String[] string = new String[]{"I", "will", "become", "the", "greatest", "hokage"};
        List<String> wordList = Arrays.asList(string);
        System.out.println(wordList);
        System.out.println(StringCollectionUtil.resetWordsByLength(wordList, 3));
        System.out.println(StringCollectionUtil.removeWordsByLength(wordList, 1));
    }
}
