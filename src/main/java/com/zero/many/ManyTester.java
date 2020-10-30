package com.zero.many;

import java.util.*;

public class ManyTester {
    public static void main(String[] args) {
        //Map與set一樣，要用"功能Map"，如果內容重複的話，跟set一樣會覆蓋內容
        HashMap<String,String> stocks=
                new HashMap<>();
        stocks.put("2650", "Sky");
        stocks.put("3980", "Keven");
        stocks.put("3980", "Shark");
        System.out.println(stocks);
        //取得資料
        System.out.println(stocks.get("2650"));
        System.out.println(stocks.get("Shark"));
        for(int i = 0;i<50;i++){
            System.out.print(".");
            if (i == 49){
                System.out.println("");
            }
        }
        //因為map沒有次序，也沒index值的概念，所以跟set一樣要使用for迴圈取得裡面的所有內容
        //keyset > 得到所有的key值
        for(String key:stocks.keySet()){
            System.out.println(stocks.get(key));
        }

        //SetTest();
        // ArrayListTest();
        // listTest();
    }

    private static void SetTest() {
        //set，不能直接用 Set set=new Set();，要用"功能Set"
        //set沒有次序，也沒index值的概念，有重複的內容會被覆蓋掉
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(7);
        System.out.println(set);
        //因為set無法使用get，因此只能用for迴圈來把所有資料拜訪一遍
        for (int i :set){
            System.out.println(i);
        }
    }

    private static void ArrayListTest() {
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
    }

    private static void listTest() {
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
