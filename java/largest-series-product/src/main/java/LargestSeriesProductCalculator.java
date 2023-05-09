class LargestSeriesProductCalculator {

    String inputNumber;

    public LargestSeriesProductCalculator(String inputNumber) {
        if (!inputNumber.matches("\\d*")) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(inputNumber.length() < numberOfDigits)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if(inputNumber.matches("^0+$"))
            return 0;
        if(numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");

        long value = 0;
        String[] numbers = inputNumber.split("");

        for (int i = 0; i <= numbers.length - numberOfDigits; i++) {
            long valueChecker = 1;
            for (int j = 0, z = i; j < numberOfDigits; j++) {
                valueChecker *= Long.parseLong(numbers[z++]);
            }
            value = Math.max(value,valueChecker);
        }
        return value;
    }
}
