package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(expectedMinutesInOven());
        System.out.println(remainingMinutesInOven(30));
        System.out.println(preparationTimeInMinutes(2));
        System.out.println(totalTimeInMinutes(3,20));
    }
    public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int n){
        return expectedMinutesInOven()-n;
    }

    public static int preparationTimeInMinutes(int n){
        return n*2;
    }

    public static int totalTimeInMinutes(int n, int m){
        return preparationTimeInMinutes(n)+m;
    }
}