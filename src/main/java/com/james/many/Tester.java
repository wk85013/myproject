package com.james.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        hashSet();

        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("1234", "James");
        stocks.put("5678", "rrrr");
        stocks.put("4567", "hhhhh");
        stocks.put("3333", "dddd");
        stocks.put("4567", "erer");//覆蓋重複key其值
        System.out.println(stocks);

        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
    }

    private static void hashSet() {
        HashSet<Integer> set = new HashSet<>();//不可重複的陣列類別
        set.add(3);
        set.add(6);
        set.add(8);
        set.add(1);
        set.add(5);
        set.add(5);//不加重複數值
        System.out.println(set);

        for (int i : set) {
            System.out.println(i);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();//可重複的陣列類別
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
