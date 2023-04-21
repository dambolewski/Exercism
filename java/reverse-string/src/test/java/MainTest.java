import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void reverseStringTest() {
        assertAll(
                () -> assertEquals("", Main.reverseString("")),
                () -> assertEquals("looc", Main.reverseString("cool"))
                );
    }
}
