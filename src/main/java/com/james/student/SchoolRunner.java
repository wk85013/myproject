package com.james.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        com.james.Student.getPass();//companion 加入 @JvmStatic可直接呼叫static參數
        Student.pass = 60;
        Student student = new Student("JAmes", 55, 60);
        student.print();
        Student student2 = new Student("Jkssd", 12, 60);
        student2.print();
        Student student3 = new Student("Polld", 65, 60);
        student3.print();

        GraduateStudent gstu = new GraduateStudent("AAAD", 70, 56, 90);
        gstu.print();

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


        Student student = new Student(name, english, math);
        student.print();
        System.out.println("Hight Score:" + student.highest());
    }
}
