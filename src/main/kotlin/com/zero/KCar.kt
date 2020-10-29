package com.zero

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter:LocalDateTime= LocalDateTime.of(2020,10,29,14,0)
    var out:LocalDateTime= LocalDateTime.now()
    var car = Car("CDA-033256",enter)
    car.out=out
    println(car.outTime())
    println(car.money())

}
class Car(val id:String,val enter:LocalDateTime){
    var out:LocalDateTime ?=null
        set(value) {
            if (enter.isBefore(value))
                //field泛指set所代表的out，如果用this.out會進入無限迴圈
                field=value
        }
    fun outTime()=Duration.between(enter,out).toMinutes()
/*    fun outTime():Long{
      return  Duration.between(enter,out).toMinutes()
    }*/
    //koltin在資料後面.to資料型態，就可以轉換資料型態
    fun money()=30*Math.ceil(outTime()/60.0).toLong()

}