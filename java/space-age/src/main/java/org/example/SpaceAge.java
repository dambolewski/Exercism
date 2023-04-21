package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class SpaceAge {

    private static double age;

    public static void main(String[] args) {
        SpaceAge spaceAge = new SpaceAge(1821023456L);
        System.out.println(onNeptune());
    }

    public SpaceAge(double seconds) {
        this.age = seconds;
    }

    public static double getSeconds() {
        return age;
    }

    public static double onEarth() {
        return calculate(age,31557600);
    }

    private static double calculate(double a, double b) {
        double ageOnEarth = a / b;
        DecimalFormat df = new DecimalFormat("0.00");
        NumberFormat nf = NumberFormat.getInstance();
        try {
            return nf.parse(df.format(ageOnEarth)).doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static double onMercury() {
        return calculate(onEarth(),0.2408467);
    }

    public static double onVenus() {
        return calculate(onEarth(),0.61519726);
    }

    public static double onMars() {
        return calculate(onEarth(),1.8808158);
    }

    public static double onJupiter() {
        return calculate(onEarth(),11.862615);
    }

    public static double onSaturn() {
        return calculate(onEarth(),29.447498);
    }

    public static double onUranus() {
        return calculate(onEarth(),84.016846);
    }

    public static double onNeptune() {
        return calculate(onEarth(),164.79132);
    }

}
