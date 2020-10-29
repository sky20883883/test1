package com.zero.parking;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        LocalDateTime enter=
                LocalDateTime.of(2020,10,29,14,0);
        LocalDateTime out = LocalDateTime.now();
        Car car =new Car("ABC-0023",enter);
        car.setOut(out);
        System.out.println(car.getOutTime());
        System.out.println(car.getOutTimeHours());
/*        long money = (long)Math.ceil(car.getOutTime()/60.0);
        System.out.println(money);
        System.out.println(30*money);*/
        System.out.println(car.money());

/*        java8TimeTest();
        oldtime();*/
    }

    private static void java8TimeTest() {
        Instant instant =Instant.now();
        System.out.println(instant);

        LocalDateTime now =LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));

        System.out.println(now.plus(Duration.ofHours(3)));
        System.out.println(formatter.format(now.plus(Duration.ofHours(3))));

        LocalDateTime other =LocalDateTime.of(2018,11,23,8,0);
        System.out.println(other);
        System.out.println(formatter.format(other));
    }

    private static void oldtime() {
        //date模組
        Date date =new Date();
        //獲取當前時間
        System.out.println(date);
        //獲取1070/1/1至當前的毫秒時間
        System.out.println(date.getTime());
        //自訂顯示內容，可以去網路尋找SimpleDateFormat的java的api來做自訂
        SimpleDateFormat sdft =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdft.format(date));
        //把自己設定的日期轉換儲存
        String s = "1999/05/25 11:15:00";
        try {
            Date other = sdft.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //日期的運算則使用Calendar模組
        Calendar calendar =Calendar.getInstance();
        //獲取當前時間，相當於Date date =new Date();
        System.out.println(calendar.getTime());
        //開始做運算，設定日期的值
        calendar.set(Calendar.MONTH,7);
        System.out.println(calendar.getTime());
        //加日期
        calendar.add(Calendar.DAY_OF_YEAR,5);
        System.out.println(calendar.getTime());
    }
}
