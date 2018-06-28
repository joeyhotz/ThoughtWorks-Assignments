import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawHorizontalLineTests {

    @Test
    void testHorizontalLineFiveAsterisks() {
        String actualOutput = DrawHorizontalLine.makeOutputString(6);
        String expectedOutput = "******";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testHorizontalLineTenAsterisks() {
        String actualOutput = DrawHorizontalLine.makeOutputString(12);
        String expectedOutput = "************";
        assertEquals(expectedOutput, actualOutput);
    }
}