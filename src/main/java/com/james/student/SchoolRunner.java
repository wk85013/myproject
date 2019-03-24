package com.james.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student_ student = new Student_("JAmes", 87, 60);
        student.print();
        System.out.println("Hight Score:" + student.highest());
    }

    private static void userInput() {
        System.out.println("plz input name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("plz input english");
        int english = scanner.nextInt();
        System.out.println("plz input math");
        int math = scanner.nextInt();


        Student_ student = new Student_(name, english, math);
        student.print();
        System.out.println("Hight Score:" + student.highest());
    }
}
