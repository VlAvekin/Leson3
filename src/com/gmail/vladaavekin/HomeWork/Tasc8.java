package com.gmail.vladaavekin.HomeWork;

// Найти 20 первых натуральных чисел, делящихся нацело на 13 или на 17 и больших 500

public class Tasc8 {

    public static void main(String[] args) {

        int a = 13;
        int b = 17;
        int N = 20;
        int large = 500;

        boolean counter = true;

        int res = 0;

        for (int i = large; counter; i++){

            if ((i % a) == 0 || (i % b) == 0) {
                res++;
                System.out.print(i + "\t");
                if (res == N) {
                    counter = false;
                    System.out.println("\n" + res);
                }
            }

        }

    }

}
