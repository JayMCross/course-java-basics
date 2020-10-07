package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог, если известно:
 *
 * @param weekDayNumber - номер дня недели
 * @return день недели на английском языке (lower case)
 */
public class Task04 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int weekdayNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);
        getNameWeekday(weekdayNumber);
    }
    private static String getNameWeekday(int weekdayNumber) {
        String dayNumToTxt = new String();
        if(weekdayNumber<1||weekdayNumber>7) {
            dayNumToTxt = null;
        }else if(weekdayNumber==1){
            dayNumToTxt = "monday";
        }else if(weekdayNumber==2){
            dayNumToTxt = "tuesday";
        }else if(weekdayNumber==3){
            dayNumToTxt = "wednesday";
        }else if(weekdayNumber==4){
            dayNumToTxt = "thursday";
        }else if(weekdayNumber==5){
            dayNumToTxt = "friday";
        }else if(weekdayNumber==6){
            dayNumToTxt = "saturday";
        }else if(weekdayNumber==7){
            dayNumToTxt = "sunday";
        }
        return dayNumToTxt;
    }
}