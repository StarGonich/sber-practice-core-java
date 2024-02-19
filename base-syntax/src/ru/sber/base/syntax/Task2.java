package ru.sber.base.syntax;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = in.nextInt();
        if (n > 500 || n < 1) {
            System.out.println("Введено недопустимое число " + n + ". Допустимый диапазон значений: 1 - 500");
        } else {
            for (int i = 1; i<=n; i++) {
                System.out.print(i*7 + " ");
            }
        }
    }
}
