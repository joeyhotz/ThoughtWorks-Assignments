import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsExerciseTest {

    @Test
    void testPrimeFactorsFor30GenerateMethod() {
        ArrayList<Integer> actualOutput = PrimeFactorsExercise.generate(30);
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(2);
        expectedOutput.add(3);
        expectedOutput.add(5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testPrimeFactorsFor30GenerateString() {
        String actualOutput = PrimeFactorsExercise.makeOutputString(30);
        String expectedOutput = "2, 3, 5";
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    void testPrimeFactorsFor100GenerateMethod() {
        ArrayList<Integer> actualOutput = PrimeFactorsExercise.generate(100);
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(2);
        expectedOutput.add(2);
        expectedOutput.add(5);
        expectedOutput.add(5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testPrimeFactorsFor100GenerateString() {
        String actualOutput = PrimeFactorsExercise.makeOutputString(100);
        String expectedOutput = "2, 2, 5, 5";
        assertEquals(expectedOutput, actualOutput);
    }

}