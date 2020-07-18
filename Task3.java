package com.vl.homework3;

/**
 * Заданы 2 массива целых чисел произвольной длины. 
 * Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {6, 7, 8, 9, 10};
        mergeArray(values1, values2);
    }

    public static void mergeArray(int[] values1, int[] values2) {
        int[] values3 = new int[values1.length + values2.length];
        for (int i = 0; i < values1.length; i++) {
            values3[i] = values1[i];
        }
        for (int i = 0; i < values2.length; i++) {
            values3[i + values1.length] = values2[i];
        }
        for (int i = 0; i < values3.length; i++) {
            System.out.print(values3[i] + " ");
        }
    }
}
