package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader num1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader num2 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(num1.readLine());
        int b = Integer.parseInt(num2.readLine());
        System.out.println(Math.min(a, b));
        }
    }