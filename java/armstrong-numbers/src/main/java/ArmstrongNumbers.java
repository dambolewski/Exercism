class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String[] numbers = String.valueOf(numberToCheck).split("");
        int number = 0;
        for (String s : numbers) {
            number += (int) Math.pow(Double.parseDouble(s), numbers.length);
        }
        return numberToCheck == number;
    }

}
