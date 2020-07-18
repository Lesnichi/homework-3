package com.vl.homework3;

/**
 * Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 0};
        invertArray(values);
    }

    public static void invertArray(int[] values) {
        int temp = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = temp;
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
