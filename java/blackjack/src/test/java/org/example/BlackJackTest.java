package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackTest {

    @Test
    public void parseCardTest() {
        assertAll(
                () -> assertEquals(11, BlackJack.parseCard("ace")),
                () -> assertEquals(10, BlackJack.parseCard("jack")),
                () -> assertEquals(10, BlackJack.parseCard("queen"))
        );
    }

    @Test
    public void isBlackjackTest() {
        assertTrue(BlackJack.isBlackjack("queen", "ace"));
        assertFalse(BlackJack.isBlackjack("eight", "ace"));
    }

    @Test
    public void largeHandTest() {
        assertAll(
                () -> assertEquals("W", BlackJack.largeHand(true, 7)),
                () -> assertEquals("P", BlackJack.largeHand(false, 7)),
                () -> assertEquals("S", BlackJack.largeHand(true,10)),
                () -> assertEquals("S", BlackJack.largeHand(true,11))
        );
    }

    @Nested
    class smallHand{
        @Test
        public void smallHandSeventeenOrMore() {
            assertAll(
                    () -> assertEquals("S", BlackJack.smallHand(17, 7)),
                    () -> assertEquals("S", BlackJack.smallHand(18, 10))
            );
        }

        @Test
        public void smallHandElevenOrLess() {
            assertAll(
                    () -> assertEquals("H", BlackJack.smallHand(11, 7)),
                    () -> assertEquals("H", BlackJack.smallHand(8, 7))
            );
        }

        @Test
        public void smallHandInRange() {
            assertAll(
                    () -> assertEquals("S", BlackJack.smallHand(13, 3)),
                    () -> assertEquals("H", BlackJack.smallHand(12, 10))
            );
        }
    }
}