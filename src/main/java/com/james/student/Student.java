package com.james.student;

import java.sql.SQLOutput;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(String name, int english, int math) {//
        this.name = name;
        this.english = english;
        this.math = math;
    }

    //package-private 同一個package才能使用
    int highest() {
        int max = 0;
        max = (english > math) ? english : math;
       /* if (english > math) {
            max = english;
        } else {
            max = math;
        }*/
        return max;

    }

    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + (getAverage() >= pass ? "PASS" : "FAIL"));
        char grading = 'F';
        switch (average / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
                break;
        }
        System.out.println("\t" + grading);

/*        if (getAverage() >= 60) {
            System.out.println("\tPASS");
        } else
            System.out.println("\tFail");*/
    }

    public int getAverage() {
        return (english + math) / 2;
    }
}
