package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSum(4, 6);
        printPositive(-3);
        returnPositive(-3);
        printString("str", 5);
        isLeapYear(2014);
        invertArray();
        fillArray();
        multArray();
        squareArray(5);
        createArray(10, 10);
    }

    private static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    private static void checkSumSign() {
        System.out.print("\n");
        int a = 10;
        int b = -4;
        if (a+b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    private static void printColor() {
        System.out.print("\n");
        int value = 11;
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    private static void compareNumbers() {
        System.out.print("\n");
        int a = 100;
        int b = 11;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    private static boolean checkSum(int a, int b) {

        return ((a + b >=10) && (a+b <=20));
    }

    private static void printPositive(int a) {
        System.out.print("\n");
        if (a < 0) System.out.println("Отрицательно число");
        else System.out.println("Положительное число");
    }

    private static boolean returnPositive(int a) {
        return a < 0;
    }
    private static void printString(String str, int a) {
        System.out.print("\n");
        for (int i =0; i <a; i++){
            System.out.print(str + " ");
        }
    }

    private static boolean isLeapYear(int year)
    {
        boolean is_leap_year = false;
        if (year % 4 == 0) {
            is_leap_year = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {}
                else
                    is_leap_year = false;
            }
        }
        return is_leap_year;
    }

    private static void invertArray(){
        int[] a = {0,1,1,1,0,0,1,0};
        System.out.println("\n");
        for (int i = 0; i < a.length; i ++) {
            a[i] = Math.abs(a[i] - 1);
            System.out.print(a[i]+ ", ");
        }
    }

    private static void fillArray(){
        int[] a = new int[100];
        System.out.println("\n");
        for (int i = 0; i < a.length; i ++) {
            a[i] = i;
            System.out.print(a[i] + ", ");
        }
    }

    private static void multArray(){
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n");
        for (int i = 0; i < a.length; i ++) {
            if (a[i] < 6) a[i]= a[i] * 2;
            System.out.print(a[i] + ", ");
        }
    }

    private static void squareArray(int size){
        System.out.print("\n");
        int[][] a = new int[size][size];
        for (int i = 0; i < a.length; i ++) {
            System.out.print("\n");
            for (int j = 0; j < a.length; j ++) {
                if ((i ==j) || (i == size-1-j)) a[i][j] = 1;
                System.out.print(a[i][j] + " ");
            }
        }
    }

    private static int[] createArray(int len, int value){
        System.out.print("\n");
        int[] a = new int[len];
        Arrays.fill(a, value);
        for (int j : a) {
            System.out.print(j + ", ");
        }
        return a;
    }
}

