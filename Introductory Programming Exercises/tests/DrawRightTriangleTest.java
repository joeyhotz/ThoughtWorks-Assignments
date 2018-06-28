import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawRightTriangleTest {

    @Test
    void testTwoLineRightTriangle() {
        String actualOutput = DrawRightTriangle.makeOutputString(2);
        String expectedOutput = "*\n**";
    }

    @Test
    void testFiveLineRightTriangle() {
        String actualOutput = DrawRightTriangle.makeOutputString(5);
        String expectedOutput = "*\n**\n***\n****\n*****";
    }
}