package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от процентного соотношения максимального
 * количества HP и текущего.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int currentHealthPoint = INPUT_SCANNER.nextInt();
        int maxHealthPoint = INPUT_SCANNER.nextInt();

        getColorHealthPoint(currentHealthPoint, maxHealthPoint);
    }

    /**
     * Возвращает цвет для шкалы HP игрока, в зависимости от процентного соотношения максимального количества HP и
     * текущего. Когда меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, меньше либо равно 100 -
     * зеленый.
     *
     * @param currentHealthPoint текущее количество HP игрока
     * @param maxHealthPoint     - максимальное количество HP игрока
     * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
     */
    static String getColorHealthPoint(int currentHealthPoint, int maxHealthPoint) {
        String color = new String();
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        if (currentHealthPoint / maxHealthPoint <= 0 || currentHealthPoint / maxHealthPoint > 1) {
            color = null;
        } else if (currentHealthPoint / maxHealthPoint > 0 & currentHealthPoint / maxHealthPoint < 0.25) {
            color = "RED";
        } else if (currentHealthPoint / maxHealthPoint >= 0.25 & currentHealthPoint / maxHealthPoint < 0.5) {
            color = "ORANGE";
        } else if (currentHealthPoint / maxHealthPoint >= 0.5 & currentHealthPoint / maxHealthPoint < 0.75) {
            color = "YELLOW";
        } else if (currentHealthPoint / maxHealthPoint >= 0.75 & currentHealthPoint / maxHealthPoint <= 1.00) {
            color = "GREEN";
        }
        return color;
    }
}