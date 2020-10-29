package com.zero.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyTester {
    public static void main(String[] args) {
        /*ArrayList list = new ArrayList();*/
        //<> 鑽石符號:一般化，讓內容統一，以免儲存內容性質不同
        ArrayList<Integer> list = new ArrayList();
        list.add(56);
        list.add(23);
        System.out.println(list);
        int n1 = list.get(0);
        System.out.println(n1);
        //知道陣列內容有多少個
        System.out.println(list.size());

        /*ArrayList<Integer> scores= Arrays.asList(100,80,82,92,68,33,75,66,15,29);*/
        //集合
        List<Integer> scores=
                Arrays.asList(100,80,82,92,68,33,75,66,15,29);
        for(int score:scores){
            System.out.println(score);
        }

//arrayTest();
    }

    private static void arrayTest() {
        int[] test=new int[5];
        test[0]=5;
        test[1]=37;
        test[2]=15;
        test[3]=66;
        test[4]=88;
        for(int i=0;i<5;i++){
            System.out.println(test[i]);
        }
        for(int i=0;i<50;i++){
            System.out.print(".");
            if (i==49){
                System.out.println(".");
            }
        }
        //for each迴圈
        int[] scores={100,80,82,92,68,33,75,66,15,29};
        for (int i:scores){
            System.out.println(i);
        }
    }
}
