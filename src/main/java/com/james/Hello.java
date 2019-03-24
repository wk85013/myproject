package com.james;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
        Person p = new Person("James", 123f, 456f);
        p.hello();
        p.weight = 65.5f;
        p.height = 185f;
        System.out.println(p.bmi());

        int score = 88;
        System.out.println(score > 80 || score < 90);

        char A = 'A';
        System.out.println(A == 65);

//        int age = 12;
//        Integer age2 = 20;
//        char c = '我';
//        Character c2 = 'A';
//        byte b = 120;
//        float weight = 120;
//        float height = 520;
//        boolean adult = true;
//        String name = "James";

    }
}
