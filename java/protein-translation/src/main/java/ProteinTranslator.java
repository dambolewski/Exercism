import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        Map<String, String> map = new HashMap<>();

        List<String> parts = usingSplitMethod(rnaSequence, 3);
        map.put("AUG","Methionine");
        map.put("UUU","Phenylalanine");
        map.put("UUC","Phenylalanine");
        map.put("UUA","Leucine");
        map.put("UUG","Leucine");
        map.put("UCU","Serine");
        map.put("UCC","Serine");
        map.put("UCA","Serine");
        map.put("UCG","Serine");
        map.put("UAU","Tyrosine");
        map.put("UAC","Tyrosine");
        map.put("UGU","Cysteine");
        map.put("UGC","Cysteine");
        map.put("UGG","Tryptophan");
        map.put("UAA","STOP");
        map.put("UAG","STOP");
        map.put("UGA","STOP");

        List<String> expected = new ArrayList<>();
        for(String s : parts){
            if(map.get(s).equals("STOP")){
                break;
            } else
                expected.add(map.get(s));
        }

        return expected;
    }

        public static List<String> usingSplitMethod(String text, int n) {
        String[] results = text.split("(?<=\\G.{" + n + "})");
        return Arrays.asList(results);
    }
}
