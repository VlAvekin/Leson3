package com.gmail.vladaavekin.HomeWork;

// Дана арифметическая прогрессия 1, 5, 9, 13, ...
// Написать программу определения суммы первых десяти
// ее членов. Вывести значение суммы и всех ее слагаемых.

public class Tasc10 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 40; i += 4) {
            System.out.print(i + "\t");
            sum += i;
        }

        System.out.println("\n" + sum);

    }

}
