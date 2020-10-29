package com.zero.many;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList();;
        Scanner scanner=new Scanner(System.in);
        int studentsScores = 0;
        System.out.println("Please enter students scores:");
        while (studentsScores != -1){
            studentsScores = scanner.nextInt();
            score.add(studentsScores);
            if (studentsScores ==-1){
                score.remove(score.size()-1);
            }
        }
        System.out.println("Your students scores:");
        System.out.println(score);
        System.out.println("Student populations:"+score.size());

    }
}
