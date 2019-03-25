package com.james.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;

    GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;

    }

    @Override
    public void print() {
//        super.print();//去除原先父類別的方法
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math + "\t" + thesis + "\t" +
                getAverage() + "\t" + (getAverage() >= pass ? "PASS" : "FAIL"));
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
    }
}
