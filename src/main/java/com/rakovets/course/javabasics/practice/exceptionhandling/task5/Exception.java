package com.rakovets.course.javabasics.practice.exceptionhandling.task5;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of int array:");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter int value at index " + i + ":");
            intArray[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter array index to get the value:");
            /*if (index < 0 || index >= size) {
                System.out.println("Valid index range is from 0 to " + (size - 1));
            } else {
                System.out.println("Value at " + index + " = " + intArray[index]);
                exit = true;
                sc.close(); */
            try {
                System.out.println("Value at " + index + " = " + intArray[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("this is my exception for the condition");
            }
        }
    }
}
