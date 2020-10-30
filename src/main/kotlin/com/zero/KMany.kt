package com.zero

import java.time.LocalDateTime
import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    var scanner=Scanner(System.`in`)
    println("Please input your car number:")
    var read = scanner.next()
    val parkingLot = HashMap<String,Car>()
    var enter: LocalDateTime =
            LocalDateTime.of(2020,10,30,14,0)
    var out: LocalDateTime =
            LocalDateTime.now()
    var car= Car("CCC-8763",enter);
    parkingLot.put(car.id,car)

    car=Car("XXX-1234",enter.plusHours(4))
    parkingLot.put(car.id,car)

    car= parkingLot.get(read)!!
    car.out=out
    println("${car.id} duration: ${car.outTime()} Minutes. You should pay ${car.money()} dollars")
    parkingLot.remove(car.id)
    println(parkingLot.size)



//ManyTester()
    //mutableListOfTester()
}

private fun mutableListOfTester() {
    val scanner = Scanner(System.`in`)
    println("Pleases enter students scores:")
    var enter = 0
    var scorein = mutableListOf<Int>()
    while (enter != -1) {
        enter = scanner.nextInt()
        scorein.add(enter)
        println("Enter!")
        if (enter == -1) {
            var a = scorein.size
            scorein.remove(-1)
            break
        }
    }
    for (i in scorein) {
        println(i)
    }
}

/*class scores(var s:Int){
    fun scorein(){
        var scorein= mutableListOf<Int>()
        if (s != -1)
        {
            scorein.add(s)
        }
        for (i in scorein) {
            println(i)
        }
    }

}*/







private fun ManyTester() {
    //listOf的儲存內容是不可變的內容
    val list = listOf(5, 1, 2, 7, 9, 12)
    println(list)
    for (i in list) {
        println(i)
    }
    println(list.get(3))
    for (i in 0..50) {
        print(".")
        if (i == 50) {
            println("")
        }
    }
    var change = mutableListOf<Int>(5, 9, 13, 86, 77)
    change.add(9)
    for (i in change) {
        println(i)
    }
}