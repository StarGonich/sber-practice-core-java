package ru.sber.base.syntax;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char letter = (char)(random.nextInt(26) + 'A');
        boolean flag = false;
        do {
            char cur = Character.toUpperCase(scanner.next().charAt(0));
            if (cur > 'Z' || cur < 'A') {
                System.out.println("Введен недопустимый символ");
            } else if (cur == letter) {
                System.out.println("Верно");
                flag = true;
            } else if (cur > letter) {
                System.out.println("Ищи букву, которая перед ней в алфавите");
            } else {
                System.out.println("Ищи букву, которая после нее в алфавите");
            }
        } while (!flag);
    }
}
