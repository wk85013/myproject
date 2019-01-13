package com.james;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        new Person().hello();
        Person p = new Person();
        p.hello();

        Integer age = 20;
        System.out.println(age.toString());
    }
}
