package com.zero;

public class Bmi {
    String name;
    float weight;
    float height;
    public float yourebmi(){
        float bmi;
        bmi = weight / (height*height);
        return bmi;
    }
}
