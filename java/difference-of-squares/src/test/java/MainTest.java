import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void computeSquareOfSumToTest(){
        assertEquals(3025 , Main.computeSquareOfSumTo(10));
    }

    @Test
    public void computeSumOfSquaresToTest(){
        assertEquals(385, Main.computeSumOfSquaresTo(10));
    }

    @Test
    public void computeDifferenceOfSquares(){
        assertEquals(2640, Main.computeDifferenceOfSquares(10));
    }

}
