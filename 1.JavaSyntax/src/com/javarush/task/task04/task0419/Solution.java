package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bfr.readLine());
        int b = Integer.parseInt(bfr.readLine());
        int c = Integer.parseInt(bfr.readLine());
        int d = Integer.parseInt(bfr.readLine());
        int max = 0;
        if(a >= b && a >= c && a >= d) max = a;
        if(b >= a && b >= c && b >= d) max = b;
        if(c >= b && c >= a && c >= d) max = c;
        if(d >= b && d >= a && d >= c) max = d;
        System.out.println(max);
    }
}
