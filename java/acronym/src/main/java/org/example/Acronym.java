package org.example;

import java.util.Arrays;

public class Acronym {
    String string;

    public static void main(String[] args) {
        Acronym acronym = new Acronym("Something - I made up from thin air");
        System.out.println(acronym.get2());
        Acronym acronym2 = new Acronym("Complementary metal-oxide semiconductor");
        System.out.println(acronym2.get2());
    }

    public Acronym(String phrase) {
        this.string = phrase;
    }

    public String get() {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        string = string.replaceAll("[^A-Za-z0-9 -]", "");
        String[] words = string.split("[ -]");
        for (int i = 0; i < words.length; i++) {
            if(i == words.length-1){
                sb.append(words[i]);
            } else
                sb.append(words[i]).append(" ");
        }
        string = sb.toString();
        string = string.replaceAll("\\s{2,}", " ").trim();
        String[] acronyms = string.split(" ");
        for (String acronym : acronyms){
            result.append(acronym.toUpperCase().charAt(0));
        }
        return result.toString();
    }

    public String get2(){
        StringBuilder result = new StringBuilder();
        String[] words = string.split("[-_ ]+");
        for (String s : words){
            result.append(s.toUpperCase().charAt(0));
        }
        return String.valueOf(result);
    }
}