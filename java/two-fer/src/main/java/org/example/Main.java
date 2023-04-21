package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(twofer(null));
    }

    public static String twofer(String name) {
        if (name != null) {
            return String.format("One for %s, one for me.", name);
        } else {
            return "One for you, one for me.";
        }
    }
}