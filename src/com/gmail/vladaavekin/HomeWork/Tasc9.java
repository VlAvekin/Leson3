package com.gmail.vladaavekin.HomeWork;

//  Дана арифметическая прогрессия с параметрами а = 2, b = 4.
// Сколько нужно взять членов прогрессии, начиная с первого,
// чтобы их сумма превысила заданную величину Z. Написать программу
// решения задачи. Вывести искомое число слагаемых, величину суммы и последнее слагаемое.

import java.util.Scanner;

public class Tasc9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = 2;
        double b = 4;

        System.out.print("Величина Z = ");
        double Z = scanner.nextDouble();

        double step = (a + b) / Z;
        double sum = 0;

        int slogCount = 1;

        double slogP = 0;

        for (double i = a; i < b; i += step) {
            sum += i;
            slogCount++;

            if (i < b) slogP = i;

        }


        System.out.println("число слагаемых = " + slogCount);
        System.out.println("Сумма = " + sum);
        System.out.println("последнее слагаемое = " + slogP);

    }

}
