package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
 *
 * @param monthNumber - номер месяца
 * @return месяц на английском языке (upper case)
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int monthNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);
        getNameMonth(monthNumber);
        System.out.println(getNameMonth(monthNumber));
    }
    public static String getNameMonth(int monthNumber) {
        String monthNumToTxt = new String();
        if(monthNumber<1||monthNumber>12) {
            monthNumToTxt = null;
        }else if (monthNumber == 1){
            monthNumToTxt = "JANUARY";
        }else if (monthNumber == 2){
            monthNumToTxt = "FEBRUARY";
        }else if (monthNumber == 3){
            monthNumToTxt = "MARCH";
        }else if(monthNumber == 4){
            monthNumToTxt = "APRIL";
        }else if(monthNumber == 5){
            monthNumToTxt = "MAY";
        }else if(monthNumber == 6){
            monthNumToTxt = "JUNE";
        }else if(monthNumber == 7){
            monthNumToTxt = "JULY";
        }else if(monthNumber == 8){
            monthNumToTxt = "AUGUST";
        }else if(monthNumber == 9){
            monthNumToTxt = "SEPTEMBER";
        }else if(monthNumber == 10){
            monthNumToTxt = "OCTOBER";
        }else if(monthNumber == 11){
            monthNumToTxt = "NOVEMBER";
        }else if(monthNumber == 12){
            monthNumToTxt = "DECEMBER";
        }
        return monthNumToTxt;
    }
}