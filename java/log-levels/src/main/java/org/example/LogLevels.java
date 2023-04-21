package org.example;

public class LogLevels {
    public static void main(String[] args) {
        System.out.println(message("[WARNING]:   \\tTimezone not set  \\r\\n"));
        System.out.println(logLevel("[WARNING]:   \\tTimezone not set  \\r\\n"));
        System.out.println(reformat("[WARNING]:   \\tTimezone not set  \\r\\n"));
    }

    public static String message(String logLine) {
        String[] split = getStrings(logLine);
        String message = split[1];
        message = message.replaceAll("\\\\[a-z]", "");
        return message.trim();
    }

    public static String logLevel(String logLine) {
        String[] split = getStrings(logLine);
        return split[0].replaceAll("[\\[\\]]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }

    private static String[] getStrings(String logLine) {
        return logLine.split(": ");
    }
}