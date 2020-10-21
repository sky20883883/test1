package com.zero;
import java.util.Scanner;

public class Hellword {
    public static void main(String[] args) {
        Sayhello p = new Sayhello();
        Bmi bmi = new Bmi(100.5f,1.7f,"Keven");
        p.hello();

        /*讀取輸入內容的方法*/
/*        Scanner scanner = new Scanner(System.in);
        String d = scanner.next();
        int e = scanner.nextInt();
        float f = scanner.nextFloat();*/

        int a = 9;
        int b = 12;
        int c= a+b;
        System.out.println(c);

/*        bmi.name="Keven";
        bmi.height=1.7f;
        bmi.weight=100.5f;*/
        System.out.println(bmi.name+"'s bmi is "+bmi.yourebmi());

    }

}
