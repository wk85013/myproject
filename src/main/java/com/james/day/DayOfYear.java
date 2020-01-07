package com.james.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("plz enter year(" + year + "):");
            String yearStr = bufferedReader.readLine();
            year = (!yearStr.isEmpty()) ? Integer.parseInt(yearStr) : year;
            System.out.println(year);

            System.out.println("plz enter month(" + month + "):");
            String monthStr = bufferedReader.readLine();
            month = (!monthStr.isEmpty()) ? Integer.parseInt(monthStr) : month;
            System.out.println(month);

            System.out.println("plz enter day(" + day + "):");
            String dayStr = bufferedReader.readLine();
            day = (!dayStr.isEmpty()) ? Integer.parseInt(dayStr) : day;
            System.out.println(day);

            int days = 0;
            for (int i = 0; i < month - 1; i++) {
                days += months[i];
            }
            days += day;
//            now.isLenient();//判斷閏年
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {//判斷閏年
                days++;
            }

            System.out.println(days);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
