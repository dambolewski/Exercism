package org.example;

public class CarAssemble {
    public static void main(String[] args) {
        System.out.println(productionRatePerHour(10));
        System.out.println(workingItemsPerMinute(10));
    }

    public static double productionRatePerHour(int speed) {
        double production = 0;
        if (speed > 0 && speed < 11) {
            switch (speed) {
                case 1, 2, 3, 4 -> {
                    production = speed * 221;
                }
                case 5, 6, 7, 8 -> {
                    production = speed * 221 * 0.9;
                }
                case 9 -> {
                    production = speed * 221 * 0.8;
                }
                case 10 -> {
                    production = speed * 221 * 0.77;
                }
            }
        } else
            return 0;
        return production;
    }


    public static int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}