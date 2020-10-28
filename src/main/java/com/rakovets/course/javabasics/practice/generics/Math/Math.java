package com.rakovets.course.javabasics.practice.generics.Math;

import java.util.ArrayList;
import java.util.List;


public class Math {
    public <T extends Number> T maxOf3(T a, T b, T c) {
        List<T> arr = new ArrayList<>() {
        };
        arr.add(a);
        arr.add(b);
        arr.add(c);

        T max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if ((double) arr.get(i) > (double) max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public <T extends Number> T minOf5(T a, T b, T c, T d, T e) {
        List<T> arr = new ArrayList<>() {
        };
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);

        T min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if ((double) arr.get(i) < (double) min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public <T extends Number> double avg(T[] array) {
        double avg = 0.0;
        for (T t : array) {
            avg += t.doubleValue() / array.length;
        }
        return avg;
    }

    public <T extends Number> T maxOfArr(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] > (double) max) {
                max = array[i];
            }
        }
        return max;
    }

    public <T extends Number> T minOfArr(T[] array) {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] < (double) min) {
                min = array[i];
            }
        }
        return min;
    }

    public <T extends Comparable<T>> T[] sortedArr(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((arr[j].compareTo(arr[j + 1])) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;


    }
}
