package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int result = 0;
        while (true) {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(bfr.readLine());
            result += number;
            if (number == -1) {
                System.out.println(result);
                break;
            }
        }
    }
}
