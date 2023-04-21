import org.example.ResistorColor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ResistorColorTest {

    private static ResistorColor resistorColor;
    @BeforeAll
    public static void setup() {
        resistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode(){
        assertEquals(0, resistorColor.colorCode("black"));
    }

    @Test
    public void testWhiteColorCode(){
        assertEquals(9, resistorColor.colorCode("white"));
    }

    @Test
    public void testColors() {
        assertEquals(Arrays.toString(resistorColor.colors()),Arrays.toString(new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"}));
        }
}
