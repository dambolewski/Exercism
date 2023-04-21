package org.example;

import java.math.BigInteger;

public class Grains {
    public static void main(String[] args) {
        System.out.println(grainsOnBoard());
        System.out.println(grainsOnSquare(3));
    }

    public static BigInteger grainsOnSquare(final int square){
        BigInteger allGrains = new BigInteger("2");
        if(square > 0 && square < 65){
            allGrains = allGrains.pow(square-1);
            return allGrains;
        } else throw new IllegalArgumentException("square must be between 1 and 64");
    }

    public static BigInteger grainsOnBoard(){
        BigInteger allGrains = new BigInteger("2");
        allGrains = allGrains.pow(64);
        allGrains = allGrains.subtract(BigInteger.valueOf(1));
        return allGrains;
    }
}