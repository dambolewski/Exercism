package org.example;

import java.util.Arrays;

public class BirdWatcher {
    public static void main(String[] args) {
        BirdWatcher bw = new BirdWatcher(new int[0]);
        System.out.println(getToday());
    }

    private static int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        BirdWatcher.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return birdsPerDay;
    }

    public static int getToday() {
        if (birdsPerDay.length != 0)
            return birdsPerDay[birdsPerDay.length - 1];
        else return 0;
    }

    public static void incrementTodaysCount() {
        if (birdsPerDay.length != 0) {
            for (int i = 0; i < 1; i++) {
                birdsPerDay[birdsPerDay.length - 1] += 1;
            }
        }
    }

    public static boolean hasDayWithoutBirds() {
        boolean without = false;
        for (int i : birdsPerDay) {
            if (i == 0) {
                without = true;
                break;
            }
        }
        return without;
    }

    public static int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays>7){
            numberOfDays = 7;
        }
        if(birdsPerDay.length != 0){
            int sum = 0;
            for (int i = 0; i < numberOfDays; i++) {
                sum += birdsPerDay[i];
            }
            return sum;
        } else return 0;
    }

    public static int getBusyDays() {
        int sum = 0;
        for (int i : birdsPerDay) {
            if (i >= 5) {
                sum++;
            }
        }
        return sum;
    }
}