package com.gmail.vladaavekin.HomeWork;

//  Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.

public class Tasc7 {

    public static void main(String[] args) {

        int a = 19;
        int N = 15;
        int large = 100;

        boolean counter = true;

        int res = 0;

        for (int i = large; counter; i++){

            if ((i % a) == 0) {
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
