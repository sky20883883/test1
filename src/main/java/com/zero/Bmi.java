package com.zero;

public class Bmi {
    String name;
    float weight;
    float height;
    public Bmi(float weight,float height){
        this.weight=weight;
        this.height=height;
    }
    public Bmi(float weight,float height,String name){
        this(weight, height); //繼承上方的weight與height
        this.name = name;

    }
    public float yourebmi(){
        float bmi;
        bmi = weight / (height*height);
        return bmi;
    }
}
