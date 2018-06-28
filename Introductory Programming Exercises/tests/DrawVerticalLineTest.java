import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawVerticalLineTest {

    @Test
    void testVerticalLineFiveAsterisks() {
        String actualOutput = DrawVerticalLine.makeOutputString(5);
        String expectedOutput = "*\n*\n*\n*\n*";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testVerticalLineTenAsterisks() {
        String actualOutput = DrawVerticalLine.makeOutputString(10);
        String expectedOutput = "*\n*\n*\n*\n*\n*\n*\n*\n*\n*";
        assertEquals(expectedOutput, actualOutput);
    }
}