class Acronym {
    String string;

    Acronym(String phrase) {
        this.string = phrase;
    }

    String get() {
        StringBuilder result = new StringBuilder();
        String[] words = string.split("[-_ ]+");
        for (String s : words){
            result.append(s.toUpperCase().charAt(0));
        }
        return String.valueOf(result);
    }
}
