package com.zero;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BmiTest {
    @Test
    public void bmitest(){
        Bmi bmi = new Bmi(100.5f,1.7f,"Keven");
        Assertions.assertEquals(100.5f/(1.7f*1.7f),bmi.yourebmi());
    }
}
