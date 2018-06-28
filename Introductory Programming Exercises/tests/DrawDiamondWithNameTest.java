import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawDiamondWithNameTest {

    @Test
    void testTwoSidedDiamondWithName() {
        String actualOutput = DrawDiamondWithName.makeOutputString(2, "Captain Sparrow");
        String expectedOutput = " * \nCaptain Sparrow\n * ";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testThreeSidedDiamondWithName() {
        String actualOutput = DrawDiamondWithName.makeOutputString(3, "Peter Griffin");
        String expectedOutput = "  *  \n *** \nPeter Griffin\n *** \n  *  ";
        assertEquals(expectedOutput, actualOutput);
    }
}