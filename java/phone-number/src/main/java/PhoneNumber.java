public class PhoneNumber {

    private final String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        phoneNumber = validateNumberPermissions(phoneNumber);
        validateNumber(phoneNumber);
        this.phoneNumber = normalizePhoneNumber(phoneNumber);
    }

    public String getNumber() {
        return phoneNumber;
    }

    private void validateNumber(String phoneNumber) {
        validateDigits(phoneNumber);
        validateAreaCode(phoneNumber);
        validateExchangeCode(phoneNumber);
    }

    private String normalizePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10)
            return phoneNumber;
        else
           return phoneNumber.substring(1);
    }

    private void validateDigits(String phoneNumber) {
        if (phoneNumber.length() < 10)
            throw new IllegalArgumentException("incorrect number of digits");
        if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '1')
            throw new IllegalArgumentException("11 digits must start with 1");
        if (phoneNumber.length() > 11)
            throw new IllegalArgumentException("more than 11 digits");
    }

    private void validateAreaCode(String phoneNumber) {
        if (phoneNumber.length() == 10 && phoneNumber.charAt(0) == '0')
            throw new IllegalArgumentException("area code cannot start with zero");
        if (phoneNumber.length() == 10 && phoneNumber.charAt(0) == '1')
            throw new IllegalArgumentException("area code cannot start with one");
        if (phoneNumber.length() == 11 && phoneNumber.charAt(1) == '0')
            throw new IllegalArgumentException("area code cannot start with zero");
        if (phoneNumber.length() == 11 && phoneNumber.charAt(1) == '1')
            throw new IllegalArgumentException("area code cannot start with one");
    }

    private void validateExchangeCode(String phoneNumber) {
        if (phoneNumber.length() == 10 && phoneNumber.charAt(3) == '0')
            throw new IllegalArgumentException("exchange code cannot start with zero");
        if (phoneNumber.length() == 10 && phoneNumber.charAt(3) == '1')
            throw new IllegalArgumentException("exchange code cannot start with one");
        if (phoneNumber.length() == 11 && phoneNumber.charAt(4) == '0')
            throw new IllegalArgumentException("exchange code cannot start with zero");
        if (phoneNumber.length() == 11 && phoneNumber.charAt(4) == '1')
            throw new IllegalArgumentException("exchange code cannot start with one");
    }

    private String validateNumberPermissions(String phoneNumber) {
        if (phoneNumber.matches(".*[a-zA-Z].*"))
            throw new IllegalArgumentException("letters not permitted");
        if (!phoneNumber.matches("^[0-9+()\\-. ]+$"))
            throw new IllegalArgumentException("punctuations not permitted");
        return phoneNumber.replaceAll("[^0-9]", "");
    }
}