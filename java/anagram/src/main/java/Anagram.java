import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

    Map<Character, Integer> charactersCount;
    String word;

    public Anagram(String word) {
        this.word = word.toLowerCase();
        this.charactersCount = createCharacterCountsMap(word);
    }

    public List<String> match(List<String> candidates) {
        List<String> anagrams = new ArrayList<>();

        for (String candidate : candidates) {
            if (candidate.equalsIgnoreCase(word)) {
                continue;
            }
            if (isAnagram(candidate)) {
                anagrams.add(candidate);
            }
        }
        return anagrams;
    }

    public boolean isAnagram(String candidate) {
        if (candidate.length() != word.length()) {
            return false;
        }
        Map<Character, Integer> candidateCharacterCounts = createCharacterCountsMap(candidate);

        for (Map.Entry<Character, Integer> entry : charactersCount.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (!candidateCharacterCounts.containsKey(key) || !candidateCharacterCounts.get(key).equals(value)) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> createCharacterCountsMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
