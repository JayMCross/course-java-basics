package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    int limit = 10;
    LinkedList linkedList = new LinkedList();

    public synchronized void produce() {
        while (linkedList.size() >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; linkedList.size() < limit; i++) {
            Random random = new Random();
            linkedList.add(random.nextInt());
            System.out.println(linkedList.getLast() + " number was added");
            System.out.println(linkedList.size() + " total");
        }
        notify();
    }

    public synchronized void consume() {
        while (linkedList.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        linkedList.removeFirst();
        System.out.println("A number was removed");
        System.out.println(linkedList.size() + " total");
        notify();
    }
}
