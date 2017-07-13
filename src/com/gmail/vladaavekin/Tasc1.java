package com.gmail.vladaavekin;

/**
 * Created by vlada on 12.07.2017.
 */
public class Tasc1 {

    public static void main(String[] args) {

        long a = 12345679;
        long mul = 1;

        for (int i = 0; i <= 81; i+=9) {
            mul = a * i;
            System.out.println(mul);
        }

    }

}
