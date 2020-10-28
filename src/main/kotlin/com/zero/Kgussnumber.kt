package com.zero

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val answer = Random().nextInt(10)+1
    println(answer)
    var number = 0
    for (i in 1..10){
        println("Please guss a number($i/10):")
        number = scanner.nextInt()
        judge(number,answer).jnumber()
        if (answer == number){
            break
        }
    }
/*    while (answer != number){
        println("Please guss a number:")
        number = scanner.nextInt()
        judge(number,answer).jnumber()
    }*/

}
class judge(var number:Int,var answer:Int){
    fun jnumber() = if (number >answer) println("To hight")
    else if(number<answer) println("To slow")
    else println("Good job!")
}