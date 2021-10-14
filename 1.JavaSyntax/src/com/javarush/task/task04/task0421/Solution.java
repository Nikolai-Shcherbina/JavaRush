package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfr1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfr2 = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bfr1.readLine();
        String name2 = bfr2.readLine();
        int a = name1.length();
        int b = name2.length();
        if(name1.equals(name2))
            System.out.println("Имена идентичны");
        else if (a == b) System.out.println("Длины имен равны");
    }
}
