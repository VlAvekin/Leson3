package com.gmail.vladaavekin.HomeWork;

//  Дано натуральное число. Верно ли, что цифра
// а встречается в нем реже, чем цифра b?

import java.util.Arrays;
import java.util.Scanner;

public class Tasc3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int newCol = 11122333;

        int[] array;
        int v = -1;
        boolean col = true;

        int temp = newCol;

        while (col){
            if (temp % 10 == 0) col = false;
            temp /= 10;
            v++;
        }

        array = new int[v];

        for (int i = 0; i < v ; i++) {
            array[i] = newCol % 10;
            newCol /= 10;
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }


        System.out.print("\nВведите a = ");
        //int a = scanner.nextInt();

        System.out.print("Введите b = ");
        //int b = scanner.nextInt();

        System.out.println();

    }

}
