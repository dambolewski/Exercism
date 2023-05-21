public class Say {

    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] thousands = {
            "", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion"
    };

    public String say(long number) {
        if (number >= 1_000_000_000_000L)
            throw new IllegalArgumentException();
        if (number < 0)
            throw new IllegalArgumentException();
        return convertToWord(number);
    }

    public static String convertToWord(long number) {
        if (number == 0L)
            return "zero";

        StringBuilder word = new StringBuilder();
        convertHelper(number, word);
        return word.toString().trim();
    }
    private static void convertHelper(long number, StringBuilder word) {
        if (number < 20) {
            word.append(units[(int) number]).append(" ");
        } else if (number < 100) {
            word.append(tens[(int) (number / 10)]);
            long remainder = number % 10;
            if(remainder != 0){
                word.append("-");
                convertHelper(remainder, word);
            }
        } else if (number < 1000) {
            word.append(units[(int) (number / 100)]).append(" hundred ");
            convertHelper(number % 100, word);
        } else {
            int power = (int) Math.log10(number) / 3;
            convertHelper(number / (long) Math.pow(1000, power), word);
            word.append(thousands[power]).append(" ");
            convertHelper(number % (long) Math.pow(1000, power), word);
        }
    }
}