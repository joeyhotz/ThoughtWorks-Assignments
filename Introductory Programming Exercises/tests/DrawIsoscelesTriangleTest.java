import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawIsoscelesTriangleTest {

    @Test
    void testTwoLineIsoscelesTriangle() {
        String actualOutput = DrawIsoscelesTriangle.makeOutputString(2);
        String expectedOutput = " * \n***";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testThreeLineIsoscelesTriangle() {
        String actualOutput = DrawIsoscelesTriangle.makeOutputString(3);
        String expectedOutput = "  *  \n *** \n*****";
        assertEquals(expectedOutput, actualOutput);
    }
}