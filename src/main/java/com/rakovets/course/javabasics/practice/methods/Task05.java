package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy. В профиле игрока месяц
 * еобходимо выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task05 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        byte monthNumber = INPUT_SCANNER.nextByte();

        getNameMonth(monthNumber);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber - номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getNameMonth(byte monthNumber) {
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
        return monthNumToTxt;    }
}