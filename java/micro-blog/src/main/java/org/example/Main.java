package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(truncate("\uD83C\uDCCE\uD83C\uDCB8\uD83C\uDCC5\uD83C\uDCCB\uD83C\uDCCD\uD83C\uDCC1\uD83C\uDCCA"));
        System.out.println(truncate("Hi"));
        System.out.println(truncate("Hello"));
        System.out.println(truncate("Добър"));
        System.out.println(truncate("υγειά"));
        System.out.println(truncate("a=πr²"));
        System.out.println(truncate("Fly \uD83D\uDEEB"));
        System.out.println(truncate("∅⊊ℕ⊊ℤ⊊ℚ⊊ℝ⊊ℂ"));
        System.out.println(truncate("❄\uD83C\uDF21\uD83E\uDD27\uD83E\uDD12\uD83C\uDFE5\uD83D\uDD70\uD83D\uDE00"));
    }

    public static String truncate(String input) {
        StringBuilder builder = new StringBuilder();
        input.codePoints().limit(5).forEach(builder::appendCodePoint);
        return builder.toString();
    }
}