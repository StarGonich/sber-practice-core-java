package ru.sber.base.syntax;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int mx = 0;
        int mx_index = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = (int)(Math.random() * 1000);
            if (array[i] > mx) {
                mx = array[i];
                mx_index = i;
            }
            sum += array[i];
        }
        System.out.println("Максимальное значение = " + mx + " находится в элементе под индексом " + mx_index);
        System.out.println("Среднее значение = " + (sum / 100));
    }
}
