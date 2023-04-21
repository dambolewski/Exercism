import org.example.ResistorColorDuo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResistorColorDuoTest {
    private static ResistorColorDuo resistorColorDuo;
    @BeforeAll
    public static void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }

    @Test
    public void testBlackColorCode(){
        assertEquals(10, resistorColorDuo.value(new String[]{"brown","black"}));
    }
}
