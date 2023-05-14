import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {
    private final String nucleotide;
    private final Map<Character, Integer> nucleotideMap = new HashMap<>();

    public NucleotideCounter(String nucleotide) {
        if(nucleotide.matches("^[ACGT]*$"))
            this.nucleotide = nucleotide;
        else
            throw new IllegalArgumentException();
    }

    public Map<Character,Integer> nucleotideCounts() {
        generateMap(nucleotideMap);
        for (int i = 0; i < nucleotide.length(); i++) {
            char c = nucleotide.charAt(i);
            switch (c) {
                case 'A' -> nucleotideMap.put('A', nucleotideMap.get('A') + 1);
                case 'C' -> nucleotideMap.put('C', nucleotideMap.get('C') + 1);
                case 'T' -> nucleotideMap.put('T', nucleotideMap.get('T') + 1);
                case 'G' -> nucleotideMap.put('G', nucleotideMap.get('G') + 1);
            }
        }
        return nucleotideMap;
    }

    private void generateMap(Map<Character, Integer> nucleotideMap) {
        nucleotideMap.put('A', 0);
        nucleotideMap.put('C', 0);
        nucleotideMap.put('G', 0);
        nucleotideMap.put('T', 0);
    }
}