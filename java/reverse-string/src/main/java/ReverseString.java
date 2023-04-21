class ReverseString {

    String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        if (!s.equals("")) {
            for (int i = s.length()-1; i >= 0; i--) {
                reversed.append(s.charAt(i));
            }
        }
        return reversed.toString();
    }
}
