package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader num1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader num2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader num3 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(num1.readLine());
        int b = Integer.parseInt(num2.readLine());
        int c = Integer.parseInt(num3.readLine());

        if(a == b && a != c) System.out.print("3");
        if(a == c && a != b) System.out.print("2");
        if(c == b && c != a) System.out.print("1");
    }
}
