package com.rakovets.course.javabasics.practice.masterWorker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker implements Runnable {
    private boolean isRunning = true;

    @Override
    public void run() {
        System.out.println("Enter an int");
        Scanner scanner = new Scanner(System.in);
        try {
            while (isRunning) {
                int number = scanner.nextInt();
                if (number == -1) {
                    isRunning = false;
                    System.out.println("shutting down");
                }
                try {
                    Thread.sleep(number * 1000);
                    System.out.println("I've slept for " + number + " seconds");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Enter next int");
            }
            System.out.println("...");
            Thread.sleep(1000);
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }catch (InterruptedException e){}
    }
}
