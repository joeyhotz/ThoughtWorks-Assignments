import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @Test
    void testFizzBuzzGame() {
        //tests with given expected output from moodle
        String actualOutput = FizzBuzzGame.makeOutputString();
        String expectedOutput = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz";
        String extractedActualOutputForTesting = actualOutput.substring(0,57); //included a 57 character required output for the exercise so ive cut it from the actual output to check if theyre equal
        assertEquals(expectedOutput,extractedActualOutputForTesting);
    }
}