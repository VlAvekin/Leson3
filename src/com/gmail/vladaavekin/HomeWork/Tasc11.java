package com.gmail.vladaavekin.HomeWork;

//  Напишите программы, которые выводят на экран :
// a - прямоугольник
// b - прямоугольный треугольник
// c - равносторонний треугольник
// d - ромб

public class Tasc11 {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 7; i++) {

            for (int j = i; j > 0; j--) {
                System.out.print("");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

}
