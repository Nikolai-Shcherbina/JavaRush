package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a > 0) a *= 2;
        else if (a < 0) a += 1;
        else a = 0;

        System.out.println(a);

    }

}