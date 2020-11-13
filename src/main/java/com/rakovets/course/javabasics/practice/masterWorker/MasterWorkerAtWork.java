package com.rakovets.course.javabasics.practice.masterWorker;

public class MasterWorkerAtWork {
    public static void main(String[] args) {
        MasterWorker masterWorker = new MasterWorker();
        Thread thread = new Thread(masterWorker, "Master");

    }
}
