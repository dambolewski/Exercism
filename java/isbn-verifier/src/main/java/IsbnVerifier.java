class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replaceAll("-","");
        if(!stringToVerify.matches("[0-9]{9}[0-9X]")){
            return false;
        }
        int value = 0;
        for (int i = 0; i < 9; i++) {
            value += (10 - i) * Character.getNumericValue(stringToVerify.charAt(i));
        }
        value += stringToVerify.charAt(9) == 'X' ? 10 : Character.getNumericValue(stringToVerify.charAt(9));

        return value % 11 == 0;
    }
}
