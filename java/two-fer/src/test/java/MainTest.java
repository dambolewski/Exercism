import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class MainTest {
    @Test
    public void noNameGiven() {
        assertEquals("One for you, one for me.", Main.twofer(null));
    }

    @Test
    public void nameGiven() {
        Assertions.assertAll(
                () -> assertEquals("One for Bob, one for me.", Main.twofer("Bob")),
                () -> assertEquals("One for Alice, one for me.", Main.twofer("Alice"))
        );
    }

}
