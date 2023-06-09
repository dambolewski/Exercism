class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();
        String[] dna = dnaStrand.split("");
        for (String s : dna) {
            switch (s) {
                case "G" -> rna.append("C");
                case "C" -> rna.append("G");
                case "T" -> rna.append("A");
                case "A" -> rna.append("U");
                default -> rna.append(s);
            }
        }
        return rna.toString();
    }

}
