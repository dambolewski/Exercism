class Scrabble {

    String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int sum = 0;
        String[] splitWords = word.split("");
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].toUpperCase().matches("A|E|I|O|U|L|N|R|S|T")) {
                sum += 1;
            } else if (splitWords[i].toUpperCase().matches("D|G")) {
                sum += 2;
            } else if (splitWords[i].toUpperCase().matches("B|C|M|P")) {
                sum += 3;
            } else if (splitWords[i].toUpperCase().matches("F|H|V|W|Y")) {
                sum += 4;
            } else if (splitWords[i].toUpperCase().matches("K")) {
                sum += 5;
            } else if (splitWords[i].toUpperCase().matches("J|X")) {
                sum += 8;
            } else if (splitWords[i].toUpperCase().matches("Q|Z")) {
                sum += 10;
            }
        }
        return sum;
    }

}
