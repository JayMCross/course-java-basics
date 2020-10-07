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
    }
    public static String getNameMonth(int monthNumber) {
        String monthNumToTxt = new String();
        if(monthNumber<1||monthNumber>12) {
            monthNumToTxt = null;
        }else if (monthNumber == 1){
            monthNumToTxt = "january";
        }else if (monthNumber == 2){
            monthNumToTxt = "february";
        }else if (monthNumber == 3){
            monthNumToTxt = "march";
        }else if(monthNumber == 4){
            monthNumToTxt = "april";
        }else if(monthNumber == 5){
            monthNumToTxt = "may";
        }else if(monthNumber == 6){
            monthNumToTxt = "june";
        }else if(monthNumber == 7){
            monthNumToTxt = "july";
        }else if(monthNumber == 8){
            monthNumToTxt = "august";
        }else if(monthNumber == 9){
            monthNumToTxt = "september";
        }else if(monthNumber == 10){
            monthNumToTxt = "october";
        }else if(monthNumber == 11){
            monthNumToTxt = "november";
        }else if(monthNumber == 12){
            monthNumToTxt = "december";
        }
        return monthNumToTxt;
    }
}