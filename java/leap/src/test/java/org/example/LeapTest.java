package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapTest {

    @Test
    public void dividedBy4(){
        assertTrue(Leap.isLeapYear(1996));
        assertFalse(Leap.isLeapYear(1997));
    }

    @Test
    public void dividedBy100(){
        assertFalse(Leap.isLeapYear(1900));
        assertTrue(Leap.isLeapYear(1600));
    }

    @Test
    public void dividedBy400(){
        assertTrue(Leap.isLeapYear(2000));
        assertTrue(Leap.isLeapYear(1600));
    }
}