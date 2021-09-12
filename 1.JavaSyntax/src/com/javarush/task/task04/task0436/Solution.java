package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfr1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfr2 = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bfr1.readLine());
        int n = Integer.parseInt(bfr2.readLine());

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
