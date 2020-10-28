package com.zero

import org.junit.Test
import org.junit.jupiter.api.Assertions

class KbmiTest (){
    @Test
    fun bmiTest(){
        val bmi =Kbmi(100.5f,1.7f,"Sky")
        Assertions.assertEquals(100.5f/(1.7f*1.7f),bmi.bmi())
    }

}