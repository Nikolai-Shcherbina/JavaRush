package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void printInfo(int i){
        for (int j = 0; j < i ; j++) {
            System.out.print(8);
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код

        for (int i = 1; i < 11; i++) {
            printInfo(i);
            System.out.println();
            }
        }
    }
