class RotationalCipher {

    private final int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            if (alphabet.indexOf(data.toLowerCase().charAt(i)) != -1) {
                if (Character.isUpperCase(data.charAt(i))) {
                    char ch = (char) ((data.charAt(i) + shiftKey - 65) % 26 + 65);
                    result.append(ch);
                } else {
                    char ch = (char) ((data.charAt(i) + shiftKey - 97) % 26 + 97);
                    result.append(ch);
                }
            }
            else result.append(data.charAt(i));
        }
        return String.valueOf(result);
    }

}
