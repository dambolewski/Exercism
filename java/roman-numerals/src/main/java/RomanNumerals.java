import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    int date;

    public RomanNumerals(int date) {
        this.date = date;
    }

    public String getRomanNumeral() {
        LinkedHashMap<String, Integer> romanNumerals = new LinkedHashMap<>();
        generateMap(romanNumerals);
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String,Integer> entry : romanNumerals.entrySet()) {
            int matches = date/entry.getValue();
            result.append(repeat(entry.getKey(), matches));
            date %= entry.getValue();
        }
        return result.toString();
    }

    private void generateMap(LinkedHashMap<String, Integer> romanNumerals) {
        romanNumerals.put("M", 1000);
        romanNumerals.put("CM", 900);
        romanNumerals.put("D", 500);
        romanNumerals.put("CD", 400);
        romanNumerals.put("C", 100);
        romanNumerals.put("XC", 90);
        romanNumerals.put("L", 50);
        romanNumerals.put("XL", 40);
        romanNumerals.put("X", 10);
        romanNumerals.put("IX", 9);
        romanNumerals.put("V", 5);
        romanNumerals.put("IV", 4);
        romanNumerals.put("I", 1);
    }

    private static String repeat(String s, int n)
    {
        if(s == null)
            return null;
        return s.repeat(Math.max(0, n));
    }
}