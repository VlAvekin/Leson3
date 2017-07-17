package com.gmail.vladaavekin.HomeWork;

// Написать программу вычисления функции y = ax^2 + b
// при a = 3 ; b = -5. Аргумент
// x принимает значения от 1 до 5 с шагом 0,5.

public class Tasc2 {

    public static void main(String[] args) {

        float a = 3;
        float b = -5;

        for(float x = 1; x <= 5; x += 0.5){
            System.out.print(x + " > ");
            System.out.print("y = ax^2 + b = ");
            System.out.println(a * Math.pow(x, 2) + b);
        }

    }

}
