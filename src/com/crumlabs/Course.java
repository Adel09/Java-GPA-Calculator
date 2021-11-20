package com.crumlabs;

public class Course {

    private String name;
    private int units;
    private int score;

    public Course() {
    }

    public Course(String name, int units, int score) {
        this.name = name;
        this.units = units;
        this.score = score;
    }



    public char getGrade(int score){
        if(score >= 70 && score <= 100){ return 'A'; }
        if(score >= 60 && score < 70){ return 'B'; }
        if(score >= 50 && score < 60){ return 'C'; }
        if(score >= 45 && score < 50){ return 'D'; }
        else{ return 'F'; }
    }

    public int getPoints(int units, char grade){
        int points = 0;
        switch (grade){
            case 'A':
                points = units * 5;
                break;
            case 'B':
                points = units * 4;
                break;
            case 'C':
                points = units * 3;
                break;
            case 'D':
                points = units * 2;
                break;
            case 'F':
                points = units * 0;
                break;
        }
        return points;
    }

}
