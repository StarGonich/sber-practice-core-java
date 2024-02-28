package ru.sber.base.syntax;
import java.util.Scanner;

public class Task4 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        String answer = isPrime(n) ? "Да" : "Нет";
        System.out.println(answer);
    }
}
