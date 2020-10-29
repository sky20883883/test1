package com.zero.parking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime out;
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }
    public void out(){
        out=LocalDateTime.now();
    }
    public void setOut(LocalDateTime out){
        if(out.isAfter(enter)){
            this.out=out;
            System.out.println(id+"\t"+formatter.format(enter));
            System.out.println(formatter.format(out));
        }
        else {
            System.out.println("Warring");
        }
    }
    public long getOutTime(){
        Duration duration = Duration.between(enter,out);
        return  duration.toMinutes();
    }
    public long getOutTimeHours(){
        Duration duration = Duration.between(enter,out);
        return  duration.toHours();
    }
    public long money(){
        Duration duration = Duration.between(enter,out);
        //轉型語法(long)後面的數值是long
        long a = (long) Math.ceil(duration.toMinutes()/60.0);
        int money = 30*(int)a;
        return money;
    }

}
