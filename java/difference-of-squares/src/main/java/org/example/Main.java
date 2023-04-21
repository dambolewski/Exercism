package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum*sum;
    }

    public static int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 0; i <= input ; i++) {
            sum += (i*i);
        }
        return sum;
    }

    public static int computeDifferenceOfSquares(int input) {
            return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}