package com.rakovets.course.javabasics.practice.concurrency.parallelCalucator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
    public static void listOfArraysOfRandomInts(int numberOfArrays) {
        List<Integer[]> list = new ArrayList<>();
        for (int i = 1; i <= numberOfArrays; i++) {
            int lengthOfArray = (int) (Math.random() * 1_000_000);
            Integer[] array = new Integer[lengthOfArray];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 300);
            }
            list.add(array);
        }
    }

    public static void getMax(List<Integer[]> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("Max element is " + Collections.max(Arrays.asList(list.get(i))));
        }
    }

    public static void calculatorWithThreads(int howManyThreads, List<Integer[]> list) {
        int numOfArraysGovernedByAThread = list.size() / howManyThreads;
        for (int j = 0; j < howManyThreads; j++) {
            int finalJ = j;
            int finalNumOfArraysGovernedByAThread = numOfArraysGovernedByAThread;
            new Thread(() -> {
                for (int i = (finalJ * finalNumOfArraysGovernedByAThread); i < ((finalJ + 1) * finalNumOfArraysGovernedByAThread); i++) {
                    getMax(list);
                }
            }).start();
        }
    }//я не знаю что делать, если количество массивов не кратно количеству потоков...
}
