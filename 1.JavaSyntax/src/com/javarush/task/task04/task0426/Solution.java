package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bfr.readLine());
        if(a % 2 == 0 && a < 0) System.out.println("отрицательное четное число");
        if((a % 2 == -1 || a == -1) && a < 0) System.out.println("отрицательное нечетное число");
        if(a == 0) System.out.println("ноль");
        if(a % 2 == 0 && a > 0) System.out.println("положительное четное число");
        if((a % 2 == 1 || a == 1) && a > 0) System.out.println("положительное нечетное число");
    }
}
