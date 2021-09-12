package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    static final short LEAP_YEAR = 366;
    static final short NOT_A_LEAP_YEAR = 365;

    private static boolean chekYear(short year) {
        return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        short year = Short.parseShort(bfr.readLine());
        boolean bool = chekYear(year);
        if (bool) System.out.println("количество дней в году: " + LEAP_YEAR);
        else System.out.println("количество дней в году: " + NOT_A_LEAP_YEAR);
    }
}