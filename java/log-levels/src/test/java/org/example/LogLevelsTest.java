package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogLevelsTest {

    @Test
    public void messageTest(){
        assertEquals("Timezone not set", LogLevels.message("[WARNING]:   \\tTimezone not set  \\r\\n"));
    }

    @Test
    public void logLevelTest(){
        assertEquals("warning", LogLevels.logLevel("[WARNING]:   \\tTimezone not set  \\r\\n"));
    }

    @Test
    public void reformatTest(){
        assertEquals("Timezone not set (warning)", LogLevels.reformat("[WARNING]:   \\tTimezone not set  \\r\\n"));
    }

}