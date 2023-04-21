package org.example;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static final List<String> languages = new ArrayList<>();

    public static boolean isEmpty() {
        return languages.isEmpty();
    }

    public static void addLanguage(String language) {
        languages.add(language);
    }

    public static void removeLanguage(String language) {
        languages.remove(language);
    }

    public static String firstLanguage() {
        return languages.get(0);
    }

    public static int count() {
        return languages.size();
    }

    public static boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public static boolean isExciting() {
        return languages.contains("Kotlin") || languages.contains("Java");
    }
}