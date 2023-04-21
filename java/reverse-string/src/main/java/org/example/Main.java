package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("cool"));
    }

    public static String reverseString(String s) {
        String reversed = "";
        if (!s.equals("")) {
            for (int i = s.length()-1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
        }
        return reversed;
    }
}