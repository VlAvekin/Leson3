package com.gmail.vladaavekin.HomeWork;

// Составить программу для вычисления значений функции на отрезке
// a b с шагом h. Результат представить в виде таблицы, первый столбец которой —
// значения аргумента, второй — соответствующие значения функции.
//
// F(x) = x - sin x;
// F(x) = sin^2 x;
// F(x) = 2 cos x - 1.

import java.util.Scanner;

public class Tasc1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вектор [а, b] с шагом h.");
        System.out.print("Введите а  = ");
        int a = scanner.nextInt();

        System.out.print("Введите b = ");
        int b = scanner.nextInt();

        System.out.print("Введите шаг h = ");
        int h = scanner.nextInt();

        for (int i = a; i <= ((b - a) / h); i++) {
            System.out.format("%x  > F(%x) = %x - sin(%x) = %.3f%n", i, i, i, i, (i - Math.sin(i)));
        }

        for (int i = a; i <= ((b - a) / h); i++) {
            System.out.format("%x  > F(%x) = sin^2(%x) = %.3f%n", i, i, i, (Math.sin(i) * Math.sin(i)));
        }

        for (int i = a; i <= ((b - a) / h); i++) {
            System.out.format("%x  > F(%x) = 2cos(%x) - 1 = %.3f%n", i, i, i, (2 * Math.cos(i) - 1));
        }

    }

}
