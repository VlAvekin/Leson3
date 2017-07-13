package com.gmail.vladaavekin;

import java.util.Scanner;

/**
 * Created by vlada on 12.07.2017.
 */
public class Tasc4 {

    public static void main(String[] args) {

        double x = 0;
        double sun = 0;
        double operant = 0;
        double factorial = 1;
        int sing = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите х = ");
        x = scanner.nextDouble();

        for (int i = 1; i < 13; i += 2) {
            // Считаем факториал
            for (int j = 1; j < i; j++) {
                factorial *= j;

            }
            // Считаем ряда
            operant = (Math.pow(x, i)) / factorial;

            sun = sun + sing * operant;

            sing *= -1;
        }

        System.out.println(sun);
    }

}
