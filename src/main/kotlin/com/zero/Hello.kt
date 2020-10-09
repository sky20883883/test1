package com.zero
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
}

// 類別 類別名稱{} kolint跟java是可以合併再一起的，所以也可以使用java的東西
class Ksayhellow{
//  方法 方法名稱
    fun hello(){
        println("Starbrust Stream kolint")
    }
}
