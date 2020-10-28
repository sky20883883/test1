package com.zero.student;

public class Score {
    String name;
    int mathscore;
    int englishscore;

    public Score(String name,int mathscore,int englishscore){
        this.name=name;
        this.mathscore=mathscore;
        this.englishscore=englishscore;
    }

    public int avearge(){
        int avearge;
        avearge = (mathscore+englishscore)/2;
        return avearge;
    }


}
