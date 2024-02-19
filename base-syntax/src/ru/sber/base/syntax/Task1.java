package ru.sber.base.syntax;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
