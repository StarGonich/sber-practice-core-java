package ru.sber.base.syntax;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void bubbleSort(int[] array) {
        int length = array.length;
        while (length != 0) {
            int max_index = 0;
            for (int i = 1; i < length; i++) {
                if (array[i-1] > array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    max_index = i;
                }
            }
            length = max_index;
        }
    }
    public static void main(String[] args) {
        int[] a = new int[30];
        for (int i = 0; i < 30; i++) {
            a[i] = (int)(Math.random() * 1001);
        }
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
