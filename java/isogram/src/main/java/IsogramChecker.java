import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Map<Character, Integer> map = new HashMap<>();
        phrase = phrase.replaceAll("\\s+|-", "").toLowerCase();
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        boolean isIsogram = true;
        for (int value : map.values()) {
            if (value > 1) {
                isIsogram = false;
                break;
            }
        }
        return isIsogram;
    }
}
