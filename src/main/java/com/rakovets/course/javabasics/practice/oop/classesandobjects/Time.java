package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSecond) {
        this.hours = totalSecond;
    }

    public Time(int hour, int minutes, int seconds) {
        this.hours = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        int totalSeconds = seconds + minutes * 60 + hours * 60 * 60;
        return totalSeconds;
    }

    public void setHours(int hour) {
        this.hours = hour;
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }


}
