class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ","");
        int numberToValidate = 0;
        boolean check = false;

        if (candidate.matches("\\d+") && candidate.length() >= 2) {
            for (int i = candidate.length() - 1; i >= 0; i--) {
                int digit = Character.getNumericValue(candidate.charAt(i));
                if (check) {
                    digit *= 2;
                    if (digit > 9) {
                        digit -= 9;
                    }
                }
                numberToValidate += digit;
                check = !check;
            }
            return (numberToValidate % 10 == 0);
        }
        return false;
    }
}
