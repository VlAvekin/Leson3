package com.gmail.vladaavekin.HomeWork;

// Вычислить значение функции

import java.util.Scanner;

public class Tasc4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k[] = new int[10];

        System.out.println("Введите х = ");
        //int x = scanner.nextInt();

        int kk = 0;

        System.out.println("Введите k = ");
        for (int i = 0; i < k.length; i++) {
            k[i] = scanner.nextInt();
            kk += k[i];
        }
        System.out.println(kk);

        for (int i = 0; i < k.length; i++) {

        }
    }

}
