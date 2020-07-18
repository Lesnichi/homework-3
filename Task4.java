package com.vl.homework3;

/**
 * Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(getArraySize(values));
        printArray(linearize(values));
    }

    public static int getArraySize(int[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                size++;
            }
        }
        return size;
    }

    public static int[] linearize(int[][] values) {
        int[] newArray = new int[getArraySize(values)];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                newArray[index] = values[i][j];
                index++;
            }
        }
        return newArray;
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}