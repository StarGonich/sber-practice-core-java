package ru.sber.base.syntax;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначчи: ");
        int n = in.nextInt();
        if (n > 100 || n < 2) {
            System.out.println("Введено недопустимое число " + n + ". Допустимый диапазон значений: 2 - 100");
        } else {
            int first = 0;
            int second = 1;
            System.out.print("0 1");
            for (int i = 2; i < n; i++) {
                int third = first + second;
                System.out.print(" " + third);
                first = second;
                second = third;
            }
        }
    }
}
