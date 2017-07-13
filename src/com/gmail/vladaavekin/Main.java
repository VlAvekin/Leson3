package com.gmail.vladaavekin;

/**
 *      Цикл
 *  повторение Цикла это итерация
 *  TODO
 *
 **/


public class Main {

    public static void main(String[] args) {

        // while
        int counter = 0;
        while (counter < 3) {
            counter++;
            System.out.println("While = " + counter);
        }

        // do while
        int counte = 0;
        do {
            counte++;
            System.out.println("DoWhile = " + counte);
        } while ( counte < 3);

        // for
        for (int i = 0; i < 3; i++){
            System.out.println("for =" + i);
        }

        // foreach
        // for(ти итер_пер : коллекция) { команды }

        // Вложеые циклы
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        // Операторы перехода
        // break
        // continue
        // return

        for (int i = 0; i < 100; i++){

            if(i == 5) break;
            System.out.println("i = " + i);
        }
        System.out.println("Цикл Завершен");

        // Enter - метка перехода
        Enter: for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.println("i+j = " + (i+j));
                if (i==3) break Enter;
            }
        }
        System.out.println("Цикл Завершен");

        // Пропускаем 3
        for (int i = 0; i < 5; i++){
            if (i == 3) continue;
            System.out.println("I = " + i);
        }
        System.out.println("Цикл Завершен");

        // Enter - метка перехода
        Enter: for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("i = " + i + " j = " + j);
                if (i==3) continue Enter;
            }
        }
        System.out.println("Цикл Завершен");

        // return
        for (int i = 0; i < 5; i++) {
            //if(i == 3) return;
            System.out.println("i = " + i);
        }
        // Эта строка не выполниться
        System.out.println("Цикл Завершен");

        // Контрольная сумма! почитать



    }

}
