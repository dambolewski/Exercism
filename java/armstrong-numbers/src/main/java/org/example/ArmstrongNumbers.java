package org.example;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(9));
        System.out.println(isArmstrongNumber(10));
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(154));
    }

    public static boolean isArmstrongNumber(int numberToCheck) {
        String[] numbers = String.valueOf(numberToCheck).split("");
        int number = 0;
        for (String s : numbers) {
            number += (int) Math.pow(Double.parseDouble(s), numbers.length);
        }
        return numberToCheck == number;
    }
}