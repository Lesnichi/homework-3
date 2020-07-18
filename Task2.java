package com.vl.homework3;

/**
 * Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 3, 4, 3, 2, 5};
        removeDuplicateItems(values);
    }

    public static void removeDuplicateItems(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    values[j] = 0;
                }
            }
        }
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}


