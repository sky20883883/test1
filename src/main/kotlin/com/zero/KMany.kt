package com.zero

import java.util.*

fun main(args: Array<String>) {
    //ManyTester()
    val scanner=Scanner(System.`in`)
    println("Pleases enter students scores:")
    var enter =0
    var scorein= mutableListOf<Int>()
    while (enter!=-1) {
        enter =scanner.nextInt()
        scorein.add(enter)
        println("Enter!")
        if(enter==-1){
            var a =scorein.size
            scorein.remove(-1)
            break}
    }
    for(i in scorein){
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