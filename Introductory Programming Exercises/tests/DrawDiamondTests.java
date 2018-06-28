import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawDiamondTests {

    @Test
    void testTwoSidedDiamond() {
        String actualOutput = DrawDiamond.makeOutputString(2);
        String expectedOutput = " * \n***\n * ";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testThreeSidedDiamond() {
        String actualOutput = DrawDiamond.makeOutputString(3);
        String expectedOutput = "  *  \n *** \n*****\n *** \n  *  ";
        assertEquals(expectedOutput, actualOutput);
    }
}