public class LogLevels {
    
    public static String message(String logLine) {
        String[] split = getStrings(logLine);
        String message = split[1];
        message = message.replaceAll("\\\\[a-z]", "");
        return message.trim();
    }

    public static String logLevel(String logLine) {
        String[] split = getStrings(logLine);
        return split[0].replaceAll("[\\[\\]]","").toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)",message(logLine),logLevel(logLine));
    }

    private static String[] getStrings(String logLine) {
        String[] split = logLine.split(": ");
        return split;
    }
}
