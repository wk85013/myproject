package com.james.many;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(1);
        int n2 = list.get(2);
        System.out.println(n1);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(12, 34, 56, 78);
        for (int score : scores) {
            System.out.println(score);


        }

    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 1;

        int[] score = {12, 34, 56, 78};
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        for (int n : score) {
            System.out.println(n);
        }
    }
}
