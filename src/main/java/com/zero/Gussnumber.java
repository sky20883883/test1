package com.zero;

import java.util.Random;
import java.util.Scanner;

public class Gussnumber {
    public static void main(String[] args) {
        int number = 0;
        int anser;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        anser = random.nextInt(10)+1;
        System.out.println(anser);
        for(int i =0;i<10;i++){
            int count = i+1;
            System.out.println("Please guss a number("+count+"/10):");
            number = scanner.nextInt();
            if (number > anser){
                System.out.println("So high");
            }else if(number < anser){
                System.out.println("So low");
            }else{
                System.out.println("Good job!");
                break;
            }
            if (i==9 & anser!=number){
                System.out.println("Try again!");
            }
        }

/*        while (anser != number){
            System.out.println("Please guss a number:");
            number = scanner.nextInt();
            if (number > anser){
                System.out.println("So high");
            }else if(number < anser){
                System.out.println("So low");
            }else{
                System.out.println("Good job!");
            }
        }*/

    }
}
