package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producerThread = new ProducerThread(store);
        ConsumerThread consumerThread = new ConsumerThread(store);
        new Thread(producerThread).start();
        new Thread(consumerThread).start();
    }
}
