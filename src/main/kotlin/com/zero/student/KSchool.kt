package com.zero.student

import java.util.*

fun main(args:Array<String>){
    val scanner =Scanner(System.`in`)
    print("Please give me your name:")
    var name:String = scanner.next()

    print("Please give me your math score:")
    var math = scanner.nextInt()

    print("Please give me your english score:")
    var english = scanner.nextInt()

    var score = Kscore(name,math,english)
}

class Kscore(var name:String,var mathscore:Int,var englishscore:Int) {
    fun avearge()= (mathscore+englishscore)/2
/*    與上面是相同的，fun可以變成運算的結果，if else與when也都可以放
        fun avearge():Int{
        val avearge = (mathscore+englishscore)/2
        return avearge
    }*/
    init{
        println("Name\tmath\tenglish\tavearge")
        println(name+"\t"+mathscore+"\t"+englishscore+"\t"+avearge())
    }
}