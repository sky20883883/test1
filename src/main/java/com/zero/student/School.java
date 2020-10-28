package com.zero.student;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give me your name:");
        String name = scanner.next();

        System.out.print("Please give me your math score:");
        int math = scanner.nextInt();

        System.out.print("Please give me your english score:");
        int english = scanner.nextInt();

        Score score = new Score(name,math,english);
        System.out.println("Name\tmath\tenglish\tavearge");
        System.out.println(name+"\t"+math+"\t"+english+"\t"+score.avearge());
    }

}
