package org.example;

public class Leap {
    public static void main(String[] args) {
        System.out.println(1900 % 100 == 0);
        System.out.println(1900 % 400 == 0);
        System.out.println(1900 % 100 == 0 && 1900 % 400 == 0);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}