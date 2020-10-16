package com.zero;


import java.util.Arrays;

public class Hellword {
    public static void main(String[] args) {
        Sayhello p = new Sayhello();
        Bmi bmi = new Bmi();
        p.hello();

        int a = 9;
        int b = 12;
        int c= a+b;
        System.out.println(c);


        bmi.name = "Keven";
        bmi.height = 1.7f;
        bmi.weight = 100.5f;
        System.out.println(bmi.name+"'s bmi is "+bmi.yourebmi());

    }
}
