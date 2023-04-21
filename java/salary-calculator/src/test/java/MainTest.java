import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMultiplierPerDaysSkipped() {
        assertEquals(1, Main.multiplierPerDaysSkipped(3));
        assertEquals(0.85, Main.multiplierPerDaysSkipped(6));
    }

    @Test
    void testMultiplierPerProductsSold() {
        assertEquals(13, Main.multiplierPerProductsSold(21));
        assertEquals(1, Main.multiplierPerProductsSold(11));
    }

    @Test
    void testBonusForProductSold() {
        assertEquals(50, Main.bonusForProductSold(5));
        assertEquals(40, Main.bonusForProductSold(4));

    }

    @Test
    void testFinalSalary() {
        assertEquals(1030, Main.finalSalary(2,3));
    }
}