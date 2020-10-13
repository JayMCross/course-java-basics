package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        double sum = 0;
        double avg = 0;
        double[] marksList = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sum = sum + marks[i][j];
                int col = j + 1;
                avg = sum / col;
            }
            marksList[i] = avg;
        }
        return marksList;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int[] marksList = new int[marks.length];
        int min = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            min = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (min > marks[i][j]) {
                    min = marks[i][j];
                }
                marksList[i] = min;
            }
        }
        return marksList;
    }

    /**
     * Возвращает максимальну отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int[] marksList = new int[marks.length];
        int max = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            max = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (max < marks[i][j]) {
                    max = marks[i][j];
                }
                marksList[i] = max;
            }
        }
        return marksList;
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}