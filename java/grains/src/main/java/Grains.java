import java.math.BigDecimal;
import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger allGrains = new BigInteger("2");
        if(square > 0 && square < 65){
            allGrains = allGrains.pow(square-1);
            return allGrains;
        } else throw new IllegalArgumentException("square must be between 1 and 64");
    }

    BigInteger grainsOnBoard() {
        BigInteger allGrains = new BigInteger("2");
        allGrains = allGrains.pow(64);
        allGrains = allGrains.subtract(BigInteger.valueOf(1));
        return allGrains;
    }

}
