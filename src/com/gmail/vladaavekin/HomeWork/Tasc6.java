package com.gmail.vladaavekin.HomeWork;

// Составить программу для нахождения всех натуральных решений
// (х и у) уравнения х2 + у2 = k2, где х, у и k лежат в интервале
// от 1 до 30. Решения, которые получаются, перестановкой х и у, считать совпадающими.

public class Tasc6 {

    public static void main(String[] args) {

        // TODO считать совпадающими.

        int minN = 1;
        int maxN = 30;

        for (int i = minN; i <= maxN; i++) {
            for (int j = minN; j <= maxN ; j++) {
                for (int l = minN; l <= maxN ; l++) {

                    if(i * i + j * j == l * l ){
                        System.out.println("x = " + i + "\t y = " + j + "\t k = " + l);
                    }
                }
            }
        }

    }

}
