import java.util.HashMap;
import java.util.Map;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] splits = input.split("[^\\p{Alpha}\\d']+");
        for (String word : splits) {
            String normalized = word.replaceAll("^'+|'+$", "").toLowerCase();
            if (!normalized.isEmpty()) {
                if (!wordCount.containsKey(normalized))
                    wordCount.put(normalized, 1);
                else {
                    wordCount.put(normalized, wordCount.get(normalized) + 1);
                }
            }
        }
        return wordCount;
    }
}
