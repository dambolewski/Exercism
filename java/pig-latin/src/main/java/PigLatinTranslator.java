class PigLatinTranslator {

    String vowel = "aeiou";
    String[] twoLetterClusters = {"bl", "br", "ch", "cl", "cr", "dr", "fl", "fr", "gl", "gr", "pl", "pr", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};


    public PigLatinTranslator() {
    }

    public String translate(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String pigLatin;
            int vowelIndex = vowel.indexOf(word.toLowerCase().charAt(0));
            int yIndex = word.indexOf("y");

            if (vowelIndex != -1 ||
                    word.toLowerCase().startsWith("xr") ||
                    word.toLowerCase().startsWith("yt")) {
                pigLatin = word + "ay";
            } else {
                boolean hasConsonantCluster = false;
                for (String cluster : twoLetterClusters) {
                    if (word.length() >= 2 && word.substring(0, 2).equals(cluster)) {
                        hasConsonantCluster = true;
                        break;
                    }
                }
                if (hasConsonantCluster) {
                    String consonantCluster;
                    if (word.length() >= 3 && vowel.indexOf(word.toLowerCase().charAt(2)) == -1) {
                        consonantCluster = word.substring(0, 3);
                        word = word.substring(3);
                    } else {
                        consonantCluster = word.substring(0, 2);
                        word = word.substring(2);
                    }
                    pigLatin = word + consonantCluster + "ay";
                } else if (word.toLowerCase().charAt(0) == 'q' && word.toLowerCase().charAt(1) == 'u') {
                    String consonantCluster = word.substring(0, 2);
                    word = word.substring(2);
                    pigLatin = word + consonantCluster + "ay";
                } else if (word.toLowerCase().charAt(1) == 'q' && word.toLowerCase().charAt(2) == 'u') {
                    String consonantCluster = word.substring(0, 3);
                    word = word.substring(3);
                    pigLatin = word + consonantCluster + "ay";
                } else if (yIndex > 0 && vowel.indexOf(word.toLowerCase().charAt(yIndex - 1)) == -1) {
                    pigLatin = word.substring(yIndex) + word.substring(0, yIndex) + "ay";
                } else {
                    String consonantCluster = word.substring(0, 1);
                    word = word.substring(1);
                    pigLatin = word + consonantCluster + "ay";
                }
            }
            result.append(pigLatin).append(" ");
        }

        return result.toString().trim();
    }
}