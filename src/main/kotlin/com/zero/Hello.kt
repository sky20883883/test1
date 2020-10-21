package com.zero

import java.util.*

// fun 方法名稱(字串名稱:字串的陣列) #main+TAB=快速輸入
fun main(args: Array<String>) {
//    分號可加可不加
//    println("Starbrust Stream kolint")
//    使用物件的方法:物件名稱().物件內容()
//    Ksayhellow().hello()
//    Sayhello().hello()
//    儲存物件值的方法 val=不可以改變這個值，var則相反
//    va? 變數名稱 = 物件名稱()
    val a = Ksayhellow()
    val b = Sayhello()
    a.hello()
    b.hello()

    val c = 9;
    val d = 10;
    val e = c*d;
    println(e)
/*    或者val bmi = Kbmi(name = "Jeson",weight = 110.5f)*/
    val bmi = Kbmi(110.5f,1.7f,"Jeson")
    println("So "+bmi.name+"'s bmi is "+bmi.bmi())

/*    kolint的讀取輸入方法
    val scanner = Scanner(System.`in`)
    var f = scanner.next()*/

}
//name:String="" 的意思是name的字串有初始值null
class Kbmi(var weight:Float,var height:Float,var name:String=""){
    init {
        println(name+"'s bmi is "+bmi())
    }
//    次要建構值
//    constructor(weight: Float,height: Float,name:String,age:Float):this(weight,height,name)
    //bmi這個方案執行完會回傳浮點數
    fun bmi():Float{
        val bmi = weight / (height*height)
        return bmi
    }
}

// 類別 類別名稱{} kolint跟java是可以合併再一起的，所以也可以使用java的東西
class Ksayhellow{
//  方法 方法名稱
    fun hello() {
    println("Starbrust Stream kolint")
}}
