class PigLatinTranslator {

    final String VOWELS = "aeiou";
    final String[] TWO_LETTER_CLUSTERS = {"bl", "br", "ch", "cl", "cr", "dr", "fl", "fr", "gl", "gr", "pl", "pr", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};


    public PigLatinTranslator() {
    }

    public String translate(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String pigLatin;
            char vowelIndex = word.toLowerCase().charAt(0);
            int yIndex = word.indexOf("y");

            if (isVowel(vowelIndex) ||
                    word.toLowerCase().startsWith("xr") ||
                    word.toLowerCase().startsWith("yt")) {
                pigLatin = word + "ay";
            } else {
                boolean hasConsonantCluster = hasTwoLetterConsonantCluster(word);
                if (hasConsonantCluster) {
                    String consonantCluster;
                    if (word.length() >= 3 && !isVowel(word.toLowerCase().charAt(2))) {
                        consonantCluster = word.substring(0, 3);
                        word = word.substring(3);
                    } else {
                        consonantCluster = word.substring(0, 2);
                        word = word.substring(2);
                    }
                    pigLatin = word + consonantCluster + "ay";
                } else if (word.startsWith("qu")) {
                    pigLatin = word.substring(2) + word.substring(0,2) + "ay";
                } else if (word.matches("[a-z]qu[a-z]*")) {
                    pigLatin = word.substring(3) + word.substring(0,3) + "ay";
                } else if (yIndex > 0 && !isVowel(word.charAt(yIndex - 1))) {
                    pigLatin = word.substring(yIndex) + word.substring(0, yIndex) + "ay";
                } else {
                    pigLatin = word.substring(1) + word.charAt(0) + "ay";
                }
            }
            result.append(pigLatin).append(" ");
        }

        return result.toString().trim();
    }

    private boolean hasTwoLetterConsonantCluster(String word) {
        boolean hasConsonantCluster = false;
        for (String cluster : TWO_LETTER_CLUSTERS) {
            if (word.length() >= 2 && word.substring(0, 2).equals(cluster)) {
                hasConsonantCluster = true;
                break;
            }
        }
        return hasConsonantCluster;
    }

    private boolean isVowel(char c) {
        return VOWELS.toLowerCase().indexOf(c) != -1;
    }

}