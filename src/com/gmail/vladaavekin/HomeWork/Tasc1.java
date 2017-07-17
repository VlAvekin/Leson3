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
        System.out.println("Введите а  = ");
        float a = scanner.nextFloat();

        System.out.println("Введите b = ");
        float b = scanner.nextFloat();

        System.out.println("Введите шаг h = ");
        float h = scanner.nextFloat();



    }

}
